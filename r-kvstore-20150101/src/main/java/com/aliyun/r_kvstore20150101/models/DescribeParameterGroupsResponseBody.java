// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of parameter templates.</p>
     */
    @NameInMap("ParameterGroups")
    public java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> parameterGroups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>686BB8A6-BBA5-47E5-8A75-D2ADE433****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupsResponseBody self = new DescribeParameterGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupsResponseBody setParameterGroups(java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> parameterGroups) {
        this.parameterGroups = parameterGroups;
        return this;
    }
    public java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> getParameterGroups() {
        return this.parameterGroups;
    }

    public DescribeParameterGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterGroupsResponseBodyParameterGroups extends TeaModel {
        /**
         * <p>The service category. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Community Edition</li>
         * <li><strong>1</strong>: Enhanced Edition (Tair)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Category")
        public Long category;

        /**
         * <p>The time when the parameter template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-18 16:32:45</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><strong>redis</strong>: Redis or Tair DRAM-based instance</li>
         * <li><strong>tair_pena</strong>: Tair persistent memory-optimized instance</li>
         * <li><strong>tair_pdb</strong>: Tair ESSD-based instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The compatible engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the parameter template was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-18 16:32:45</p>
         */
        @NameInMap("Modified")
        public String modified;

        /**
         * <p>The parameter template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("ParamGroupId")
        public String paramGroupId;

        /**
         * <p>The description of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        /**
         * <p>The name of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroupName</p>
         */
        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        public static DescribeParameterGroupsResponseBodyParameterGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseBodyParameterGroups self = new DescribeParameterGroupsResponseBodyParameterGroups();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setCategory(Long category) {
            this.category = category;
            return this;
        }
        public Long getCategory() {
            return this.category;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParamGroupId(String paramGroupId) {
            this.paramGroupId = paramGroupId;
            return this;
        }
        public String getParamGroupId() {
            return this.paramGroupId;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

    }

}
