// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateMaYiBlockRequest extends TeaModel {
    @NameInMap("BlockId")
    public String blockId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlockTimes")
    public java.util.List<CreateMaYiBlockRequestBlockTimes> blockTimes;

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
    public CreateMaYiBlockRequestScope scope;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public String type;

    public static CreateMaYiBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaYiBlockRequest self = new CreateMaYiBlockRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaYiBlockRequest setBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }
    public String getBlockId() {
        return this.blockId;
    }

    public CreateMaYiBlockRequest setBlockTimes(java.util.List<CreateMaYiBlockRequestBlockTimes> blockTimes) {
        this.blockTimes = blockTimes;
        return this;
    }
    public java.util.List<CreateMaYiBlockRequestBlockTimes> getBlockTimes() {
        return this.blockTimes;
    }

    public CreateMaYiBlockRequest setBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }
    public String getBlockType() {
        return this.blockType;
    }

    public CreateMaYiBlockRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public CreateMaYiBlockRequest setDirector(java.util.List<String> director) {
        this.director = director;
        return this;
    }
    public java.util.List<String> getDirector() {
        return this.director;
    }

    public CreateMaYiBlockRequest setFaultVersion(String faultVersion) {
        this.faultVersion = faultVersion;
        return this;
    }
    public String getFaultVersion() {
        return this.faultVersion;
    }

    public CreateMaYiBlockRequest setInformation(java.util.List<String> information) {
        this.information = information;
        return this;
    }
    public java.util.List<String> getInformation() {
        return this.information;
    }

    public CreateMaYiBlockRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateMaYiBlockRequest setScope(CreateMaYiBlockRequestScope scope) {
        this.scope = scope;
        return this;
    }
    public CreateMaYiBlockRequestScope getScope() {
        return this.scope;
    }

    public CreateMaYiBlockRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateMaYiBlockRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateMaYiBlockRequestBlockTimes extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        public static CreateMaYiBlockRequestBlockTimes build(java.util.Map<String, ?> map) throws Exception {
            CreateMaYiBlockRequestBlockTimes self = new CreateMaYiBlockRequestBlockTimes();
            return TeaModel.build(map, self);
        }

        public CreateMaYiBlockRequestBlockTimes setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateMaYiBlockRequestBlockTimes setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateMaYiBlockRequestScopeGroupBlockScopeParams extends TeaModel {
        @NameInMap("Az")
        public String az;

        @NameInMap("Idc")
        public String idc;

        @NameInMap("Region")
        public String region;

        public static CreateMaYiBlockRequestScopeGroupBlockScopeParams build(java.util.Map<String, ?> map) throws Exception {
            CreateMaYiBlockRequestScopeGroupBlockScopeParams self = new CreateMaYiBlockRequestScopeGroupBlockScopeParams();
            return TeaModel.build(map, self);
        }

        public CreateMaYiBlockRequestScopeGroupBlockScopeParams setAz(String az) {
            this.az = az;
            return this;
        }
        public String getAz() {
            return this.az;
        }

        public CreateMaYiBlockRequestScopeGroupBlockScopeParams setIdc(String idc) {
            this.idc = idc;
            return this;
        }
        public String getIdc() {
            return this.idc;
        }

        public CreateMaYiBlockRequestScopeGroupBlockScopeParams setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class CreateMaYiBlockRequestScope extends TeaModel {
        @NameInMap("GroupBlockScopeParams")
        public java.util.List<CreateMaYiBlockRequestScopeGroupBlockScopeParams> groupBlockScopeParams;

        public static CreateMaYiBlockRequestScope build(java.util.Map<String, ?> map) throws Exception {
            CreateMaYiBlockRequestScope self = new CreateMaYiBlockRequestScope();
            return TeaModel.build(map, self);
        }

        public CreateMaYiBlockRequestScope setGroupBlockScopeParams(java.util.List<CreateMaYiBlockRequestScopeGroupBlockScopeParams> groupBlockScopeParams) {
            this.groupBlockScopeParams = groupBlockScopeParams;
            return this;
        }
        public java.util.List<CreateMaYiBlockRequestScopeGroupBlockScopeParams> getGroupBlockScopeParams() {
            return this.groupBlockScopeParams;
        }

    }

}
