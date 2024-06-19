// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the parameter template.</p>
     */
    @NameInMap("ParameterGroup")
    public DescribeParameterGroupResponseBodyParameterGroup parameterGroup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupResponseBody self = new DescribeParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupResponseBody setParameterGroup(DescribeParameterGroupResponseBodyParameterGroup parameterGroup) {
        this.parameterGroup = parameterGroup;
        return this;
    }
    public DescribeParameterGroupResponseBodyParameterGroup getParameterGroup() {
        return this.parameterGroup;
    }

    public DescribeParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>timeout</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ParamValue")
        public String paramValue;

        public static DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails self = new DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class DescribeParameterGroupResponseBodyParameterGroup extends TeaModel {
        /**
         * <p>The service category. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Community Edition</li>
         * <li><strong>1</strong>: Enhanced Edition (Tair)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The compatible engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
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
         * <p>The parameter template ID, which is globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>sys-001*****</p>
         */
        @NameInMap("ParamGroupId")
        public String paramGroupId;

        /**
         * <p>The parameter details of the parameter template.</p>
         */
        @NameInMap("ParamGroupsDetails")
        public java.util.List<DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails> paramGroupsDetails;

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

        public static DescribeParameterGroupResponseBodyParameterGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParameterGroup self = new DescribeParameterGroupResponseBodyParameterGroup();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParameterGroup setCategory(Long category) {
            this.category = category;
            return this;
        }
        public Long getCategory() {
            return this.category;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParamGroupId(String paramGroupId) {
            this.paramGroupId = paramGroupId;
            return this;
        }
        public String getParamGroupId() {
            return this.paramGroupId;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParamGroupsDetails(java.util.List<DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails> paramGroupsDetails) {
            this.paramGroupsDetails = paramGroupsDetails;
            return this;
        }
        public java.util.List<DescribeParameterGroupResponseBodyParameterGroupParamGroupsDetails> getParamGroupsDetails() {
            return this.paramGroupsDetails;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

    }

}
