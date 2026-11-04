// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillsMarketResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of skills.</p>
     */
    @NameInMap("SkillList")
    public java.util.List<DescribePolarClawSkillsMarketResponseBodySkillList> skillList;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribePolarClawSkillsMarketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillsMarketResponseBody self = new DescribePolarClawSkillsMarketResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillsMarketResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarClawSkillsMarketResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePolarClawSkillsMarketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawSkillsMarketResponseBody setSkillList(java.util.List<DescribePolarClawSkillsMarketResponseBodySkillList> skillList) {
        this.skillList = skillList;
        return this;
    }
    public java.util.List<DescribePolarClawSkillsMarketResponseBodySkillList> getSkillList() {
        return this.skillList;
    }

    public DescribePolarClawSkillsMarketResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePolarClawSkillsMarketResponseBodySkillList extends TeaModel {
        /**
         * <p>The assessment status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AssessmentStatus")
        public String assessmentStatus;

        /**
         * <p>The number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DownloadCount")
        public String downloadCount;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>alibabacloud-polardbx-sql</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1-beta.1</p>
         */
        @NameInMap("SkillVersion")
        public String skillVersion;

        /**
         * <p>The OpenAPI summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Automatically created repository via Image-manage</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The tag group.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Alcohol</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribePolarClawSkillsMarketResponseBodySkillList build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawSkillsMarketResponseBodySkillList self = new DescribePolarClawSkillsMarketResponseBodySkillList();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawSkillsMarketResponseBodySkillList setAssessmentStatus(String assessmentStatus) {
            this.assessmentStatus = assessmentStatus;
            return this;
        }
        public String getAssessmentStatus() {
            return this.assessmentStatus;
        }

        public DescribePolarClawSkillsMarketResponseBodySkillList setDownloadCount(String downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public String getDownloadCount() {
            return this.downloadCount;
        }

        public DescribePolarClawSkillsMarketResponseBodySkillList setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public DescribePolarClawSkillsMarketResponseBodySkillList setSkillVersion(String skillVersion) {
            this.skillVersion = skillVersion;
            return this;
        }
        public String getSkillVersion() {
            return this.skillVersion;
        }

        public DescribePolarClawSkillsMarketResponseBodySkillList setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribePolarClawSkillsMarketResponseBodySkillList setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public DescribePolarClawSkillsMarketResponseBodySkillList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
