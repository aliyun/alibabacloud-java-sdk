// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdateWordGroupShrinkRequest extends TeaModel {
    /**
     * <p>Request object.</p>
     */
    @NameInMap("BodyData")
    public String bodyDataShrink;

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

    public static UpdateWordGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWordGroupShrinkRequest self = new UpdateWordGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWordGroupShrinkRequest setBodyDataShrink(String bodyDataShrink) {
        this.bodyDataShrink = bodyDataShrink;
        return this;
    }
    public String getBodyDataShrink() {
        return this.bodyDataShrink;
    }

    public UpdateWordGroupShrinkRequest setCommit(Boolean commit) {
        this.commit = commit;
        return this;
    }
    public Boolean getCommit() {
        return this.commit;
    }

    public UpdateWordGroupShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateWordGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateWordGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateWordGroupShrinkRequest setWordInfoListModified(Boolean wordInfoListModified) {
        this.wordInfoListModified = wordInfoListModified;
        return this;
    }
    public Boolean getWordInfoListModified() {
        return this.wordInfoListModified;
    }

}
