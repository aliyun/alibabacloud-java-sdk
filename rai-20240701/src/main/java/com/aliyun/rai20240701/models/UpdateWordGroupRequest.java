// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdateWordGroupRequest extends TeaModel {
    /**
     * <p>Request object.</p>
     */
    @NameInMap("BodyData")
    public UpdateWordGroupRequestBodyData bodyData;

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
     * <p>Keyword group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>Keyword group name.</p>
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
     * <p>Whether the keyword information has been modified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WordInfoListModified")
    public Boolean wordInfoListModified;

    public static UpdateWordGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWordGroupRequest self = new UpdateWordGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWordGroupRequest setBodyData(UpdateWordGroupRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public UpdateWordGroupRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public UpdateWordGroupRequest setCommit(Boolean commit) {
        this.commit = commit;
        return this;
    }
    public Boolean getCommit() {
        return this.commit;
    }

    public UpdateWordGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateWordGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateWordGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateWordGroupRequest setWordInfoListModified(Boolean wordInfoListModified) {
        this.wordInfoListModified = wordInfoListModified;
        return this;
    }
    public Boolean getWordInfoListModified() {
        return this.wordInfoListModified;
    }

    public static class UpdateWordGroupRequestBodyDataWordInfoList extends TeaModel {
        /**
         * <p>Label.</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Inv.</p>
         */
        @NameInMap("Word")
        public String word;

        public static UpdateWordGroupRequestBodyDataWordInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdateWordGroupRequestBodyDataWordInfoList self = new UpdateWordGroupRequestBodyDataWordInfoList();
            return TeaModel.build(map, self);
        }

        public UpdateWordGroupRequestBodyDataWordInfoList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public UpdateWordGroupRequestBodyDataWordInfoList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class UpdateWordGroupRequestBodyData extends TeaModel {
        /**
         * <p>List of keyword groups.</p>
         */
        @NameInMap("WordInfoList")
        public java.util.List<UpdateWordGroupRequestBodyDataWordInfoList> wordInfoList;

        public static UpdateWordGroupRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateWordGroupRequestBodyData self = new UpdateWordGroupRequestBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateWordGroupRequestBodyData setWordInfoList(java.util.List<UpdateWordGroupRequestBodyDataWordInfoList> wordInfoList) {
            this.wordInfoList = wordInfoList;
            return this;
        }
        public java.util.List<UpdateWordGroupRequestBodyDataWordInfoList> getWordInfoList() {
            return this.wordInfoList;
        }

    }

}
