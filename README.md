ERRORS:
**APi-GATEWAY ERROR:**

The response status is 200
2024-11-05T19:47:12.163+05:30 ERROR 22744 --- [API-GATEWAY] [ctor-http-nio-3] a.w.r.e.AbstractErrorWebExceptionHandler : [e2a11ea6-1]  500 Server Error for HTTP GET "/employee/1"

java.net.UnknownHostException: Failed to resolve 'DESKTOP-LEFVFT2.mshome.net' [A(1), AAAA(28)] after 2 queries 
	at io.netty.resolver.dns.DnsResolveContext.finishResolve(DnsResolveContext.java:1150) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
	Suppressed: reactor.core.publisher.FluxOnAssembly$OnAssemblyException: 
Error has been observed at the following site(s):
	*__checkpoint ⇢ org.springframework.cloud.gateway.filter.WeightCalculatorWebFilter [DefaultWebFilterChain]
	*__checkpoint ⇢ HTTP GET "/employee/1" [ExceptionHandlingWebHandler]
Original Stack Trace:
		at io.netty.resolver.dns.DnsResolveContext.finishResolve(DnsResolveContext.java:1150) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.resolver.dns.DnsResolveContext.tryToFinishResolve(DnsResolveContext.java:1097) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.resolver.dns.DnsResolveContext.query(DnsResolveContext.java:455) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.resolver.dns.DnsResolveContext.onResponse(DnsResolveContext.java:686) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.resolver.dns.DnsResolveContext.access$500(DnsResolveContext.java:70) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.resolver.dns.DnsResolveContext$2.operationComplete(DnsResolveContext.java:513) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:583) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:559) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.DefaultPromise.setSuccess0(DefaultPromise.java:625) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.DefaultPromise.trySuccess(DefaultPromise.java:105) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.resolver.dns.DnsQueryContext.trySuccess(DnsQueryContext.java:308) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.resolver.dns.DnsQueryContext.finishSuccess(DnsQueryContext.java:299) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler.channelRead(DnsNameResolver.java:1491) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103) ~[netty-codec-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.nio.AbstractNioMessageChannel$NioMessageUnsafe.read(AbstractNioMessageChannel.java:97) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562) ~[netty-transport-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.114.Final.jar:4.1.114.Final]
		at java.base/java.lang.Thread.run(Thread.java:1570) ~[na:na]
Caused by: io.netty.resolver.dns.DnsErrorCauseException: Query failed with NXDOMAIN
	at io.netty.resolver.dns.DnsResolveContext.onResponse(..)(Unknown Source) ~[netty-resolver-dns-4.1.114.Final.jar:4.1.114.Final]



**ERRORS:**
**DEPATMENT --CONFIF ERROR :**

Starting Servlet engine: [Apache Tomcat/10.1.31]
2024-11-05T19:46:53.231+05:30  INFO 6612 --- [DEPARTMENT-SERVICE] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-11-05T19:46:53.233+05:30  INFO 6612 --- [DEPARTMENT-SERVICE] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5829 ms
2024-11-05T19:46:53.352+05:30  WARN 6612 --- [DEPARTMENT-SERVICE] [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Failed to initialize dependency 'dataSourceScriptDatabaseInitializer' of LoadTimeWeaverAware bean 'entityManagerFactory': Error creating bean with name 'dataSourceScriptDatabaseInitializer' defined in class path resource [org/springframework/boot/autoconfigure/sql/init/DataSourceInitializationConfiguration.class]: Unsatisfied dependency expressed through method 'dataSourceScriptDatabaseInitializer' parameter 0: Error creating bean with name 'dataSource' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration$Hikari.class]: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception with message: Failed to determine a suitable driver class
2024-11-05T19:46:53.356+05:30  INFO 6612 --- [DEPARTMENT-SERVICE] [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2024-11-05T19:46:53.397+05:30  INFO 6612 --- [DEPARTMENT-SERVICE] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2024-11-05T19:46:53.448+05:30 ERROR 6612 --- [DEPARTMENT-SERVICE] [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).



