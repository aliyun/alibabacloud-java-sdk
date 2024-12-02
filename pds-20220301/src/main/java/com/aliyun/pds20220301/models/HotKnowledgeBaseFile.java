// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class HotKnowledgeBaseFile extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("action_count")
    public Long actionCount;

    @NameInMap("action_list")
    public java.util.List<String> actionList;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>1727578860000</p>
     */
    @NameInMap("count_at")
    public Long countAt;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <strong>example:</strong>
     * <p>666ff36c22278f023ec</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>4jTsp3AgW</p>
     */
    @NameInMap("knowledge_base_id")
    public String knowledgeBaseId;

    /**
     * <strong>example:</strong>
     * <p>a.jpg</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>666ff36c22278f023ec</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    public static HotKnowledgeBaseFile build(java.util.Map<String, ?> map) throws Exception {
        HotKnowledgeBaseFile self = new HotKnowledgeBaseFile();
        return TeaModel.build(map, self);
    }

    public HotKnowledgeBaseFile setActionCount(Long actionCount) {
        this.actionCount = actionCount;
        return this;
    }
    public Long getActionCount() {
        return this.actionCount;
    }

    public HotKnowledgeBaseFile setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public HotKnowledgeBaseFile setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public HotKnowledgeBaseFile setCountAt(Long countAt) {
        this.countAt = countAt;
        return this;
    }
    public Long getCountAt() {
        return this.countAt;
    }

    public HotKnowledgeBaseFile setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public HotKnowledgeBaseFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public HotKnowledgeBaseFile setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public HotKnowledgeBaseFile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HotKnowledgeBaseFile setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

}
