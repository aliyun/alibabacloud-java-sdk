// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountResponseBody extends TeaModel {
    /**
     * <p>The number of startup items.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Autorun")
    public Integer autorun;

    /**
     * <p>The number of scheduled tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Cron")
    public Integer cron;

    /**
     * <p>The number of databases.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Database")
    public Integer database;

    /**
     * <p>The number of kernel modules.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Lkm")
    public Integer lkm;

    /**
     * <p>The number of ports.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The number of processes.</p>
     * 
     * <strong>example:</strong>
     * <p>367</p>
     */
    @NameInMap("Process")
    public Integer process;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of middleware assets.</p>
     * 
     * <strong>example:</strong>
     * <p>112</p>
     */
    @NameInMap("Sca")
    public Integer sca;

    /**
     * <p>The number of software assets.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("Software")
    public Integer software;

    /**
     * <p>The number of accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>214</p>
     */
    @NameInMap("User")
    public Integer user;

    /**
     * <p>The number of websites.</p>
     * 
     * <strong>example:</strong>
     * <p>65</p>
     */
    @NameInMap("Web")
    public Integer web;

    /**
     * <p>The number of web services.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
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
