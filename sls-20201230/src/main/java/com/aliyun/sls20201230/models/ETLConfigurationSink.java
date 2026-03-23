// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ETLConfigurationSink extends TeaModel {
    /**
     * <p>授权写入目标Logstore的AccessKey ID</p>
     */
    @NameInMap("accessKeyId")
    @Deprecated
    public String accessKeyId;

    /**
     * <p>授权写入目标Logstore的AccessKey Secret</p>
     */
    @NameInMap("accessKeySecret")
    @Deprecated
    public String accessKeySecret;

    /**
     * <p>写入结果集</p>
     */
    @NameInMap("datasets")
    public java.util.List<String> datasets;

    /**
     * <p>目标Project所在区域的endpoint</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>目标Logstore名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>输出目标名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-etljob</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>目标Project名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>授权写入目标Logstore的角色ARN</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::13234:role/logtarget</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    public static ETLConfigurationSink build(java.util.Map<String, ?> map) throws Exception {
        ETLConfigurationSink self = new ETLConfigurationSink();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public ETLConfigurationSink setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    @Deprecated
    public ETLConfigurationSink setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public ETLConfigurationSink setDatasets(java.util.List<String> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<String> getDatasets() {
        return this.datasets;
    }

    public ETLConfigurationSink setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ETLConfigurationSink setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ETLConfigurationSink setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ETLConfigurationSink setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ETLConfigurationSink setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
