// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterGroupsResponseBody extends TeaModel {
    /**
     * <p>The parameter templates.</p>
     */
    @NameInMap("ParameterGroups")
    public java.util.List<DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups> parameterGroups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLakebaseMountParameterGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterGroupsResponseBody self = new DescribeLakebaseMountParameterGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterGroupsResponseBody setParameterGroups(java.util.List<DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups> parameterGroups) {
        this.parameterGroups = parameterGroups;
        return this;
    }
    public java.util.List<DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups> getParameterGroups() {
        return this.parameterGroups;
    }

    public DescribeLakebaseMountParameterGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups extends TeaModel {
        /**
         * <p>The creation time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-07T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the parameter template is applied. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsApply")
        public String isApply;

        /**
         * <p>The modification time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10T12:00:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The number of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParameterCounts")
        public Integer parameterCounts;

        /**
         * <p>The description of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>Default template</p>
         */
        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        /**
         * <p>The ID of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>pcpg-lakebase-xxx</p>
         */
        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        /**
         * <p>The name of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>default-template</p>
         */
        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li>0: System.</li>
         * <li>1: User.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterGroupType")
        public String parameterGroupType;

        public static DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups self = new DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups();
            return TeaModel.build(map, self);
        }

        public DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups setIsApply(String isApply) {
            this.isApply = isApply;
            return this;
        }
        public String getIsApply() {
            return this.isApply;
        }

        public DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups setParameterCounts(Integer parameterCounts) {
            this.parameterCounts = parameterCounts;
            return this;
        }
        public Integer getParameterCounts() {
            return this.parameterCounts;
        }

        public DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        public DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeLakebaseMountParameterGroupsResponseBodyParameterGroups setParameterGroupType(String parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

    }

}
