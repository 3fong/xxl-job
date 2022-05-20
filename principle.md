## 原理

### job执行

服务启动时基于spring的生命周期,在
    com.xxl.job.admin.core.conf.XxlJobAdminConfig.afterPropertiesSet 中初始化job上下文,开启job声明周期: com.xxl.job.admin.core.scheduler.XxlJobScheduler.init

服务启动后,会每5s进行一次库调度任务查询,获取需要进行调度的JobInfo: com.xxl.job.admin.core.thread.JobScheduleHelper.start

需要进行调度的job放入调度队列中: com.xxl.job.core.biz.impl.ExecutorBizImpl.run

每3s取调度队列中取出一个job进行执行: com.xxl.job.core.thread.JobThread.run



























