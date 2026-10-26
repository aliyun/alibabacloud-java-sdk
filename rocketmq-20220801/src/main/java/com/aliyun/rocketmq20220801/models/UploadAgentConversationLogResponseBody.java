// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UploadAgentConversationLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>client.log</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>0198c8a91f4d7f01a3c21e99</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>client-logs/0198c8a91f4d7f01a3c21e99/client.log</p>
     */
    @NameInMap("sandboxPath")
    public String sandboxPath;

    /**
     * <strong>example:</strong>
     * <p>114</p>
     */
    @NameInMap("size")
    public Long size;

    public static UploadAgentConversationLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentConversationLogResponseBody self = new UploadAgentConversationLogResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadAgentConversationLogResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadAgentConversationLogResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UploadAgentConversationLogResponseBody setSandboxPath(String sandboxPath) {
        this.sandboxPath = sandboxPath;
        return this;
    }
    public String getSandboxPath() {
        return this.sandboxPath;
    }

    public UploadAgentConversationLogResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
