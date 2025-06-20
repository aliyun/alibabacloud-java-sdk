// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateMaYiBlockShrinkRequest extends TeaModel {
    @NameInMap("BlockId")
    public String blockId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlockTimes")
    public java.util.List<CreateMaYiBlockShrinkRequestBlockTimes> blockTimes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlockType")
    public String blockType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreatorEmpId")
    public String creatorEmpId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Director")
    public java.util.List<String> director;

    @NameInMap("FaultVersion")
    public String faultVersion;

    @NameInMap("Information")
    public java.util.List<String> information;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Reason")
    public String reason;

    @NameInMap("Scope")
    public String scopeShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public String type;

    public static CreateMaYiBlockShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaYiBlockShrinkRequest self = new CreateMaYiBlockShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaYiBlockShrinkRequest setBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }
    public String getBlockId() {
        return this.blockId;
    }

    public CreateMaYiBlockShrinkRequest setBlockTimes(java.util.List<CreateMaYiBlockShrinkRequestBlockTimes> blockTimes) {
        this.blockTimes = blockTimes;
        return this;
    }
    public java.util.List<CreateMaYiBlockShrinkRequestBlockTimes> getBlockTimes() {
        return this.blockTimes;
    }

    public CreateMaYiBlockShrinkRequest setBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }
    public String getBlockType() {
        return this.blockType;
    }

    public CreateMaYiBlockShrinkRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public CreateMaYiBlockShrinkRequest setDirector(java.util.List<String> director) {
        this.director = director;
        return this;
    }
    public java.util.List<String> getDirector() {
        return this.director;
    }

    public CreateMaYiBlockShrinkRequest setFaultVersion(String faultVersion) {
        this.faultVersion = faultVersion;
        return this;
    }
    public String getFaultVersion() {
        return this.faultVersion;
    }

    public CreateMaYiBlockShrinkRequest setInformation(java.util.List<String> information) {
        this.information = information;
        return this;
    }
    public java.util.List<String> getInformation() {
        return this.information;
    }

    public CreateMaYiBlockShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateMaYiBlockShrinkRequest setScopeShrink(String scopeShrink) {
        this.scopeShrink = scopeShrink;
        return this;
    }
    public String getScopeShrink() {
        return this.scopeShrink;
    }

    public CreateMaYiBlockShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateMaYiBlockShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateMaYiBlockShrinkRequestBlockTimes extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        public static CreateMaYiBlockShrinkRequestBlockTimes build(java.util.Map<String, ?> map) throws Exception {
            CreateMaYiBlockShrinkRequestBlockTimes self = new CreateMaYiBlockShrinkRequestBlockTimes();
            return TeaModel.build(map, self);
        }

        public CreateMaYiBlockShrinkRequestBlockTimes setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateMaYiBlockShrinkRequestBlockTimes setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
