// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAIAppJobResponseBody extends TeaModel {
    /**
     * <p>The task information.</p>
     */
    @NameInMap("AIAppJob")
    public GetAIAppJobResponseBodyAIAppJob AIAppJob;

    /**
     * <p>The output assets.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;Status&quot;: &quot;completed&quot;,
     *     &quot;Type&quot;: &quot;image&quot;,
     *     &quot;Url&quot;: &quot;xxx&quot;,
     *     &quot;Name&quot;: &quot;blue.png&quot;
     *   },
     *   {
     *     &quot;Status&quot;: &quot;completed&quot;,
     *     &quot;Type&quot;: &quot;image&quot;,
     *     &quot;Url&quot;: &quot;xxx&quot;,
     *     &quot;Name&quot;: &quot;red.png&quot;
     *   }
     * ]</p>
     */
    @NameInMap("Artifacts")
    public java.util.List<GetAIAppJobResponseBodyArtifacts> artifacts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAIAppJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIAppJobResponseBody self = new GetAIAppJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIAppJobResponseBody setAIAppJob(GetAIAppJobResponseBodyAIAppJob AIAppJob) {
        this.AIAppJob = AIAppJob;
        return this;
    }
    public GetAIAppJobResponseBodyAIAppJob getAIAppJob() {
        return this.AIAppJob;
    }

    public GetAIAppJobResponseBody setArtifacts(java.util.List<GetAIAppJobResponseBodyArtifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public java.util.List<GetAIAppJobResponseBodyArtifacts> getArtifacts() {
        return this.artifacts;
    }

    public GetAIAppJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAIAppJobResponseBodyAIAppJob extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-06T02:06:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-06T16:59:25Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a2880a70cec1414cac476bce0bd39ad7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The node results of the workflow task. The results are in JSON format and vary based on the workflow configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Key\&quot;:\&quot;Value\&quot;}</p>
         */
        @NameInMap("NodeResults")
        public String nodeResults;

        /**
         * <p>The task outputs.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Status\&quot;:\&quot;Success\&quot;}</p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>init: The task is created.</li>
         * <li>running: The task is running.</li>
         * <li>succeeded: The task succeeded.</li>
         * <li>failed: The task failed.</li>
         * <li>stopped: The task is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The custom information.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Key\&quot;:\&quot;Value\&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetAIAppJobResponseBodyAIAppJob build(java.util.Map<String, ?> map) throws Exception {
            GetAIAppJobResponseBodyAIAppJob self = new GetAIAppJobResponseBodyAIAppJob();
            return TeaModel.build(map, self);
        }

        public GetAIAppJobResponseBodyAIAppJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAIAppJobResponseBodyAIAppJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetAIAppJobResponseBodyAIAppJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIAppJobResponseBodyAIAppJob setNodeResults(String nodeResults) {
            this.nodeResults = nodeResults;
            return this;
        }
        public String getNodeResults() {
            return this.nodeResults;
        }

        public GetAIAppJobResponseBodyAIAppJob setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public GetAIAppJobResponseBodyAIAppJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIAppJobResponseBodyAIAppJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetAIAppJobResponseBodyAIAppJob setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAIAppJobResponseBodyArtifacts extends TeaModel {
        /**
         * <p>The asset ID, which is the media asset ID obtained after registration.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx77i16crgqtn96ip914bmixxxx</p>
         */
        @NameInMap("AssetId")
        public String assetId;

        /**
         * <p>The asset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_00x</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The asset status.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The asset type. Valid values: image, audio, video, document, and text.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The asset URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i1/O1CN0157aHKQ1LlJ45vCQ8w_!!6000000001339-0-tps-1080-773.jpg">https://img.alicdn.com/imgextra/i1/O1CN0157aHKQ1LlJ45vCQ8w_!!6000000001339-0-tps-1080-773.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetAIAppJobResponseBodyArtifacts build(java.util.Map<String, ?> map) throws Exception {
            GetAIAppJobResponseBodyArtifacts self = new GetAIAppJobResponseBodyArtifacts();
            return TeaModel.build(map, self);
        }

        public GetAIAppJobResponseBodyArtifacts setAssetId(String assetId) {
            this.assetId = assetId;
            return this;
        }
        public String getAssetId() {
            return this.assetId;
        }

        public GetAIAppJobResponseBodyArtifacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAIAppJobResponseBodyArtifacts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIAppJobResponseBodyArtifacts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAIAppJobResponseBodyArtifacts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
