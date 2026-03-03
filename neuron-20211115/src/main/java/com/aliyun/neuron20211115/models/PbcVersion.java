// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcVersion extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <strong>example:</strong>
     * <p>企业服务团队</p>
     */
    @NameInMap("companyName")
    public String companyName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("developerId")
    public Long developerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("isWatched")
    public Boolean isWatched;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("reviewId")
    public Long reviewId;

    /**
     * <strong>example:</strong>
     * <p>DEVELOPING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPEC</p>
     */
    @NameInMap("stepStatus")
    public String stepStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2022-04-01&quot;</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("visibilityLevel")
    public String visibilityLevel;

    public static PbcVersion build(java.util.Map<String, ?> map) throws Exception {
        PbcVersion self = new PbcVersion();
        return TeaModel.build(map, self);
    }

    public PbcVersion setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PbcVersion setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public PbcVersion setDeveloperId(Long developerId) {
        this.developerId = developerId;
        return this;
    }
    public Long getDeveloperId() {
        return this.developerId;
    }

    public PbcVersion setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcVersion setIsWatched(Boolean isWatched) {
        this.isWatched = isWatched;
        return this;
    }
    public Boolean getIsWatched() {
        return this.isWatched;
    }

    public PbcVersion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PbcVersion setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public PbcVersion setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PbcVersion setReviewId(Long reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public Long getReviewId() {
        return this.reviewId;
    }

    public PbcVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PbcVersion setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
        return this;
    }
    public String getStepStatus() {
        return this.stepStatus;
    }

    public PbcVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public PbcVersion setVisibilityLevel(String visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public String getVisibilityLevel() {
        return this.visibilityLevel;
    }

}
