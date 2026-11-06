// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillTemplatesRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type.</p>
     * <blockquote>
     * <p>If you are calling this operation for the first time, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The end time of the query in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-16T16:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query all available regions for the current account, including region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The skill template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pcpg-skill-2ze5v8n27o7x92a</p>
     */
    @NameInMap("SkillTemplateId")
    public String skillTemplateId;

    /**
     * <p>The start time of the query in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-15T16:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePolarClawSkillTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillTemplatesRequest self = new DescribePolarClawSkillTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillTemplatesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawSkillTemplatesRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribePolarClawSkillTemplatesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePolarClawSkillTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarClawSkillTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePolarClawSkillTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePolarClawSkillTemplatesRequest setSkillTemplateId(String skillTemplateId) {
        this.skillTemplateId = skillTemplateId;
        return this;
    }
    public String getSkillTemplateId() {
        return this.skillTemplateId;
    }

    public DescribePolarClawSkillTemplatesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
