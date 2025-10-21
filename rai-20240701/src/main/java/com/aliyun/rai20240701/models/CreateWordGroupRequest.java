// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreateWordGroupRequest extends TeaModel {
    /**
     * <p>Request object</p>
     */
    @NameInMap("BodyData")
    public CreateWordGroupRequestBodyData bodyData;

    /**
     * <p>Whether to commit.
     * false: Not actually saved, only checked
     * true: Commit and save</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Commit")
    public Boolean commit;

    /**
     * <p>Keyword group name</p>
     * 
     * <strong>example:</strong>
     * <p>testGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>643168</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateWordGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWordGroupRequest self = new CreateWordGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateWordGroupRequest setBodyData(CreateWordGroupRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public CreateWordGroupRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public CreateWordGroupRequest setCommit(Boolean commit) {
        this.commit = commit;
        return this;
    }
    public Boolean getCommit() {
        return this.commit;
    }

    public CreateWordGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateWordGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWordGroupRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateWordGroupRequestBodyDataWordInfoList extends TeaModel {
        /**
         * <p>Label</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Keyword</p>
         * 
         * <strong>example:</strong>
         * <p>Inv.</p>
         */
        @NameInMap("Word")
        public String word;

        public static CreateWordGroupRequestBodyDataWordInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateWordGroupRequestBodyDataWordInfoList self = new CreateWordGroupRequestBodyDataWordInfoList();
            return TeaModel.build(map, self);
        }

        public CreateWordGroupRequestBodyDataWordInfoList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateWordGroupRequestBodyDataWordInfoList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class CreateWordGroupRequestBodyData extends TeaModel {
        /**
         * <p>Keyword group list</p>
         */
        @NameInMap("WordInfoList")
        public java.util.List<CreateWordGroupRequestBodyDataWordInfoList> wordInfoList;

        public static CreateWordGroupRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWordGroupRequestBodyData self = new CreateWordGroupRequestBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWordGroupRequestBodyData setWordInfoList(java.util.List<CreateWordGroupRequestBodyDataWordInfoList> wordInfoList) {
            this.wordInfoList = wordInfoList;
            return this;
        }
        public java.util.List<CreateWordGroupRequestBodyDataWordInfoList> getWordInfoList() {
            return this.wordInfoList;
        }

    }

}
