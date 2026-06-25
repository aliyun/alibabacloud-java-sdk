// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateJobScriptRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The script content.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/bash
     * echo &quot;xxl-job: hello shell&quot;</p>
     * <p>echo &quot;脚本位置: $0&quot;
     * echo &quot;任务参数: $1&quot;
     * echo &quot;分片序号 = $2&quot;
     * echo &quot;分片总数 = $3&quot;</p>
     * <p>echo &quot;Good bye!&quot;
     * exit 0</p>
     */
    @NameInMap("ScriptContent")
    public String scriptContent;

    /**
     * <p>The description of the script version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>init version</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    public static UpdateJobScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobScriptRequest self = new UpdateJobScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobScriptRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateJobScriptRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateJobScriptRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public UpdateJobScriptRequest setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
    }

    public UpdateJobScriptRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

}
