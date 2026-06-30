// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentFileResponseBody extends TeaModel {
    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The file details.</p>
     */
    @NameInMap("File")
    public DescribePolarClawAgentFileResponseBodyFile file;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The working directory path.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/node/.openclaw/workspace-main</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static DescribePolarClawAgentFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentFileResponseBody self = new DescribePolarClawAgentFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentFileResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DescribePolarClawAgentFileResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawAgentFileResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawAgentFileResponseBody setFile(DescribePolarClawAgentFileResponseBodyFile file) {
        this.file = file;
        return this;
    }
    public DescribePolarClawAgentFileResponseBodyFile getFile() {
        return this.file;
    }

    public DescribePolarClawAgentFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawAgentFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawAgentFileResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class DescribePolarClawAgentFileResponseBodyFile extends TeaModel {
        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a helpful assistant.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Indicates whether the file is missing.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Missing")
        public Boolean missing;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SOUL.md</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/workspace-main/SOUL.md</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The last updated UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1716000000000</p>
         */
        @NameInMap("UpdatedAtMs")
        public Long updatedAtMs;

        public static DescribePolarClawAgentFileResponseBodyFile build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentFileResponseBodyFile self = new DescribePolarClawAgentFileResponseBodyFile();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentFileResponseBodyFile setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribePolarClawAgentFileResponseBodyFile setMissing(Boolean missing) {
            this.missing = missing;
            return this;
        }
        public Boolean getMissing() {
            return this.missing;
        }

        public DescribePolarClawAgentFileResponseBodyFile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolarClawAgentFileResponseBodyFile setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePolarClawAgentFileResponseBodyFile setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribePolarClawAgentFileResponseBodyFile setUpdatedAtMs(Long updatedAtMs) {
            this.updatedAtMs = updatedAtMs;
            return this;
        }
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

    }

}
