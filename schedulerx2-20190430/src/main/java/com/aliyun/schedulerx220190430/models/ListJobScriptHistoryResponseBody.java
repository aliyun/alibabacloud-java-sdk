// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListJobScriptHistoryResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the jobs.</p>
     */
    @NameInMap("Data")
    public ListJobScriptHistoryResponseBodyData data;

    /**
     * <p>The additional information returned only if an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>job is not existed, jobId=302</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F68ABED-AC31-4412-9297-D9A8F0401108</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <p>true</p>
     * <p>false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListJobScriptHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobScriptHistoryResponseBody self = new ListJobScriptHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobScriptHistoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListJobScriptHistoryResponseBody setData(ListJobScriptHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobScriptHistoryResponseBodyData getData() {
        return this.data;
    }

    public ListJobScriptHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobScriptHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobScriptHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-12 14:52:42</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1272118248844842</p>
         */
        @NameInMap("Creator")
        public String creator;

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
         * <p>init version</p>
         */
        @NameInMap("VersionesDescription")
        public String versionesDescription;

        public static ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos build(java.util.Map<String, ?> map) throws Exception {
            ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos self = new ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos();
            return TeaModel.build(map, self);
        }

        public ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

        public ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos setVersionesDescription(String versionesDescription) {
            this.versionesDescription = versionesDescription;
            return this;
        }
        public String getVersionesDescription() {
            return this.versionesDescription;
        }

    }

    public static class ListJobScriptHistoryResponseBodyData extends TeaModel {
        /**
         * <p>The information about the job\&quot;s historical scripts.</p>
         */
        @NameInMap("JobScriptHistoryInfos")
        public java.util.List<ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos> jobScriptHistoryInfos;

        public static ListJobScriptHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobScriptHistoryResponseBodyData self = new ListJobScriptHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobScriptHistoryResponseBodyData setJobScriptHistoryInfos(java.util.List<ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos> jobScriptHistoryInfos) {
            this.jobScriptHistoryInfos = jobScriptHistoryInfos;
            return this;
        }
        public java.util.List<ListJobScriptHistoryResponseBodyDataJobScriptHistoryInfos> getJobScriptHistoryInfos() {
            return this.jobScriptHistoryInfos;
        }

    }

}
