// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountResponseBody extends TeaModel {
    @NameInMap("Autorun")
    public Integer autorun;

    @NameInMap("Cron")
    public Integer cron;

    @NameInMap("Database")
    public Integer database;

    @NameInMap("Lkm")
    public Integer lkm;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Process")
    public Integer process;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sca")
    public Integer sca;

    @NameInMap("Software")
    public Integer software;

    @NameInMap("User")
    public Integer user;

    @NameInMap("Web")
    public Integer web;

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
