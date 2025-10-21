// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListModelInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rai_content_detection_model</p>
     */
    @NameInMap("EasServiceName")
    public String easServiceName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsSidecarPolicy")
    public Integer isSidecarPolicy;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsSupportContentSafe")
    public Integer isSupportContentSafe;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsSupportPromptAttack")
    public Integer isSupportPromptAttack;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsSupportSensitiveTopic")
    public Integer isSupportSensitiveTopic;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModelSource")
    public String modelSource;

    /**
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>643168</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListModelInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelInstanceRequest self = new ListModelInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListModelInstanceRequest setEasServiceName(String easServiceName) {
        this.easServiceName = easServiceName;
        return this;
    }
    public String getEasServiceName() {
        return this.easServiceName;
    }

    public ListModelInstanceRequest setIsSidecarPolicy(Integer isSidecarPolicy) {
        this.isSidecarPolicy = isSidecarPolicy;
        return this;
    }
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
    }

    public ListModelInstanceRequest setIsSupportContentSafe(Integer isSupportContentSafe) {
        this.isSupportContentSafe = isSupportContentSafe;
        return this;
    }
    public Integer getIsSupportContentSafe() {
        return this.isSupportContentSafe;
    }

    public ListModelInstanceRequest setIsSupportPromptAttack(Integer isSupportPromptAttack) {
        this.isSupportPromptAttack = isSupportPromptAttack;
        return this;
    }
    public Integer getIsSupportPromptAttack() {
        return this.isSupportPromptAttack;
    }

    public ListModelInstanceRequest setIsSupportSensitiveTopic(Integer isSupportSensitiveTopic) {
        this.isSupportSensitiveTopic = isSupportSensitiveTopic;
        return this;
    }
    public Integer getIsSupportSensitiveTopic() {
        return this.isSupportSensitiveTopic;
    }

    public ListModelInstanceRequest setModelSource(String modelSource) {
        this.modelSource = modelSource;
        return this;
    }
    public String getModelSource() {
        return this.modelSource;
    }

    public ListModelInstanceRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelInstanceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListModelInstanceRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListModelInstanceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
