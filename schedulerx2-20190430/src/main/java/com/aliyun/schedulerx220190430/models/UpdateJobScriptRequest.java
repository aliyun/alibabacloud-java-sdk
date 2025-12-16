// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateJobScriptRequest extends TeaModel {
    /**
     * <p>The application ID. You can obtain the application ID on the Applications page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job ID. You can obtain the ID on the Tasks page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>301</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespaces page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The script content.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/bash</p>
     * <h1>The following are predefined variables provided by the system. You can use them to obtain information about the job run.</h1>
     * <p>echo &quot;Job parameters: #{schedulerx.jobParameters}&quot;
     * echo &quot;Shard index: #{schedulerx.shardingId}&quot;
     * echo &quot;Shard parameters: #{schedulerx.shardingParameters}&quot;
     * echo &quot;Total number of shards: #{schedulerx.shardingNum}&quot;
     * echo &quot;Current retry count: #{schedulerx.attempt}&quot;
     * echo &quot;Trigger type: #{schedulerx.triggerType}&quot;
     * echo &quot;Scheduled timestamp: #{schedulerx.scheduleTime}&quot;
     * echo &quot;Data timestamp: #{schedulerx.dataTime}&quot;</p>
     * <h1>The output of the last line will be returned as the result</h1>
     * <p>echo &quot;hello world&quot;</p>
     * <h1>exit 1 indicates failure</h1>
     * <p>exit 0</p>
     */
    @NameInMap("ScriptContent")
    public String scriptContent;

    /**
     * <p>The description of the script version.</p>
     * 
     * <strong>example:</strong>
     * <p>Print job running information</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    public static UpdateJobScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobScriptRequest self = new UpdateJobScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobScriptRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateJobScriptRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public UpdateJobScriptRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateJobScriptRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public UpdateJobScriptRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
