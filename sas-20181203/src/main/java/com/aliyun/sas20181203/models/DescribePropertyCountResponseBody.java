// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountResponseBody extends TeaModel {
    // The number of startup items.
    @NameInMap("Autorun")
    public Integer autorun;

    // The number of scheduled tasks.
    @NameInMap("Cron")
    public Integer cron;

    // The number of databases.
    @NameInMap("Database")
    public Integer database;

    // The number of kernel modules.
    @NameInMap("Lkm")
    public Integer lkm;

    // The number of ports.
    @NameInMap("Port")
    public Integer port;

    // The number of processes.
    @NameInMap("Process")
    public Integer process;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The number of middleware assets.
    @NameInMap("Sca")
    public Integer sca;

    // The number of software assets.
    @NameInMap("Software")
    public Integer software;

    // The number of accounts.
    @NameInMap("User")
    public Integer user;

    // The number of websites.
    @NameInMap("Web")
    public Integer web;

    // The number of web services.
    @NameInMap("Webserver")
    public Integer webserver;

    public static DescribePropertyCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCountResponseBody self = new DescribePropertyCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCountResponseBody setAutorun(Integer autorun) {
        this.autorun = autorun;
        return this;
    }
    public Integer getAutorun() {
        return this.autorun;
    }

    public DescribePropertyCountResponseBody setCron(Integer cron) {
        this.cron = cron;
        return this;
    }
    public Integer getCron() {
        return this.cron;
    }

    public DescribePropertyCountResponseBody setDatabase(Integer database) {
        this.database = database;
        return this;
    }
    public Integer getDatabase() {
        return this.database;
    }

    public DescribePropertyCountResponseBody setLkm(Integer lkm) {
        this.lkm = lkm;
        return this;
    }
    public Integer getLkm() {
        return this.lkm;
    }

    public DescribePropertyCountResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DescribePropertyCountResponseBody setProcess(Integer process) {
        this.process = process;
        return this;
    }
    public Integer getProcess() {
        return this.process;
    }

    public DescribePropertyCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePropertyCountResponseBody setSca(Integer sca) {
        this.sca = sca;
        return this;
    }
    public Integer getSca() {
        return this.sca;
    }

    public DescribePropertyCountResponseBody setSoftware(Integer software) {
        this.software = software;
        return this;
    }
    public Integer getSoftware() {
        return this.software;
    }

    public DescribePropertyCountResponseBody setUser(Integer user) {
        this.user = user;
        return this;
    }
    public Integer getUser() {
        return this.user;
    }

    public DescribePropertyCountResponseBody setWeb(Integer web) {
        this.web = web;
        return this;
    }
    public Integer getWeb() {
        return this.web;
    }

    public DescribePropertyCountResponseBody setWebserver(Integer webserver) {
        this.webserver = webserver;
        return this;
    }
    public Integer getWebserver() {
        return this.webserver;
    }

}
