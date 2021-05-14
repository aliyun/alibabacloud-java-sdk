// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountResponseBody extends TeaModel {
    @NameInMap("Process")
    public Integer process;

    @NameInMap("AutoRun")
    public Integer autoRun;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("User")
    public Integer user;

    @NameInMap("Software")
    public Integer software;

    @NameInMap("Cron")
    public Integer cron;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Sca")
    public Integer sca;

    public static DescribePropertyCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCountResponseBody self = new DescribePropertyCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCountResponseBody setProcess(Integer process) {
        this.process = process;
        return this;
    }
    public Integer getProcess() {
        return this.process;
    }

    public DescribePropertyCountResponseBody setAutoRun(Integer autoRun) {
        this.autoRun = autoRun;
        return this;
    }
    public Integer getAutoRun() {
        return this.autoRun;
    }

    public DescribePropertyCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePropertyCountResponseBody setUser(Integer user) {
        this.user = user;
        return this;
    }
    public Integer getUser() {
        return this.user;
    }

    public DescribePropertyCountResponseBody setSoftware(Integer software) {
        this.software = software;
        return this;
    }
    public Integer getSoftware() {
        return this.software;
    }

    public DescribePropertyCountResponseBody setCron(Integer cron) {
        this.cron = cron;
        return this;
    }
    public Integer getCron() {
        return this.cron;
    }

    public DescribePropertyCountResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DescribePropertyCountResponseBody setSca(Integer sca) {
        this.sca = sca;
        return this;
    }
    public Integer getSca() {
        return this.sca;
    }

}
