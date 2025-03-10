// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeWorkgroupsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of workgroups.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The queried workgroups.</p>
     */
    @NameInMap("Workgroups")
    public DescribeWorkgroupsResponseBodyWorkgroups workgroups;

    public static DescribeWorkgroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkgroupsResponseBody self = new DescribeWorkgroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkgroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWorkgroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWorkgroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWorkgroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWorkgroupsResponseBody setWorkgroups(DescribeWorkgroupsResponseBodyWorkgroups workgroups) {
        this.workgroups = workgroups;
        return this;
    }
    public DescribeWorkgroupsResponseBodyWorkgroups getWorkgroups() {
        return this.workgroups;
    }

    public static class DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag extends TeaModel {
        /**
         * <p>The tag key of the workgroup.</p>
         * <p>You can specify an empty string as a tag key. The tag key can be up to 64 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the workgroup. Valid values of N: 1 to 20.</p>
         * <p>You can specify an empty string as a tag value. The tag value can be up to 64 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag self = new DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag> tag;

        public static DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTags self = new DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTags setTag(java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarningSourceIds extends TeaModel {
        @NameInMap("SourceId")
        public java.util.List<String> sourceId;

        public static DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarningSourceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarningSourceIds self = new DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarningSourceIds();
            return TeaModel.build(map, self);
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarningSourceIds setSourceId(java.util.List<String> sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public java.util.List<String> getSourceId() {
            return this.sourceId;
        }

    }

    public static class DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning extends TeaModel {
        /**
         * <p>The migration sources for which alerts are generated.</p>
         */
        @NameInMap("SourceIds")
        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarningSourceIds sourceIds;

        /**
         * <p>The type of the alert. Valid values:</p>
         * <ul>
         * <li>InError: A migration job failed.</li>
         * <li>UnRelated: No migration job is created for a migration source.</li>
         * <li>NotPassed: A migration job failed to pass the migration test.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InError</p>
         */
        @NameInMap("WarningType")
        public String warningType;

        public static DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning self = new DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning();
            return TeaModel.build(map, self);
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning setSourceIds(DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarningSourceIds sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarningSourceIds getSourceIds() {
            return this.sourceIds;
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning setWarningType(String warningType) {
            this.warningType = warningType;
            return this;
        }
        public String getWarningType() {
            return this.warningType;
        }

    }

    public static class DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarnings extends TeaModel {
        @NameInMap("Warning")
        public java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning> warning;

        public static DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarnings build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarnings self = new DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarnings();
            return TeaModel.build(map, self);
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarnings setWarning(java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarningsWarning> getWarning() {
            return this.warning;
        }

    }

    public static class DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup extends TeaModel {
        /**
         * <p>The description of the workgroup.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the workgroup.</p>
         * 
         * <strong>example:</strong>
         * <p>testWorkgroupName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The state of the workgroup. Valid values:</p>
         * <ul>
         * <li>NotStarted</li>
         * <li>InProgress</li>
         * <li>Cutover</li>
         * <li>Completed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag information of the workgroup.</p>
         */
        @NameInMap("Tags")
        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTags tags;

        /**
         * <p>The alert information of the workgroup, which can contain multiple types of alerts.</p>
         */
        @NameInMap("Warnings")
        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarnings warnings;

        /**
         * <p>The workgroup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-***</p>
         */
        @NameInMap("WorkgroupId")
        public String workgroupId;

        public static DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup self = new DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup();
            return TeaModel.build(map, self);
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup setTags(DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupTags getTags() {
            return this.tags;
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup setWarnings(DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarnings warnings) {
            this.warnings = warnings;
            return this;
        }
        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroupWarnings getWarnings() {
            return this.warnings;
        }

        public DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup setWorkgroupId(String workgroupId) {
            this.workgroupId = workgroupId;
            return this;
        }
        public String getWorkgroupId() {
            return this.workgroupId;
        }

    }

    public static class DescribeWorkgroupsResponseBodyWorkgroups extends TeaModel {
        @NameInMap("Workgroup")
        public java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup> workgroup;

        public static DescribeWorkgroupsResponseBodyWorkgroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkgroupsResponseBodyWorkgroups self = new DescribeWorkgroupsResponseBodyWorkgroups();
            return TeaModel.build(map, self);
        }

        public DescribeWorkgroupsResponseBodyWorkgroups setWorkgroup(java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup> workgroup) {
            this.workgroup = workgroup;
            return this;
        }
        public java.util.List<DescribeWorkgroupsResponseBodyWorkgroupsWorkgroup> getWorkgroup() {
            return this.workgroup;
        }

    }

}
