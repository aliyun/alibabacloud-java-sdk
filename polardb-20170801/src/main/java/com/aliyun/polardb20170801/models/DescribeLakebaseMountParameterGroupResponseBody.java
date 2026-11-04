// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The creation time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether the parameter template is applied. Valid values: 0: No. 1: Yes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsApply")
    public Integer isApply;

    /**
     * <p>The modification time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-10T12:00:00Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The parameter details of the template. An empty array is returned if no data is available.</p>
     */
    @NameInMap("ParameterDetail")
    public java.util.List<DescribeLakebaseMountParameterGroupResponseBodyParameterDetail> parameterDetail;

    /**
     * <p>The description of the parameter template.</p>
     * 
     * <strong>example:</strong>
     * <p>Default template</p>
     */
    @NameInMap("ParameterGroupDesc")
    public String parameterGroupDesc;

    /**
     * <p>The parameter template ID.</p>
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
     * <p>The parameter templatetype. Valid values: 0: System. 1: User.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParameterGroupType")
    public Integer parameterGroupType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLakebaseMountParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterGroupResponseBody self = new DescribeLakebaseMountParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterGroupResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeLakebaseMountParameterGroupResponseBody setIsApply(Integer isApply) {
        this.isApply = isApply;
        return this;
    }
    public Integer getIsApply() {
        return this.isApply;
    }

    public DescribeLakebaseMountParameterGroupResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeLakebaseMountParameterGroupResponseBody setParameterDetail(java.util.List<DescribeLakebaseMountParameterGroupResponseBodyParameterDetail> parameterDetail) {
        this.parameterDetail = parameterDetail;
        return this;
    }
    public java.util.List<DescribeLakebaseMountParameterGroupResponseBodyParameterDetail> getParameterDetail() {
        return this.parameterDetail;
    }

    public DescribeLakebaseMountParameterGroupResponseBody setParameterGroupDesc(String parameterGroupDesc) {
        this.parameterGroupDesc = parameterGroupDesc;
        return this;
    }
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    public DescribeLakebaseMountParameterGroupResponseBody setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public DescribeLakebaseMountParameterGroupResponseBody setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    public DescribeLakebaseMountParameterGroupResponseBody setParameterGroupType(Integer parameterGroupType) {
        this.parameterGroupType = parameterGroupType;
        return this;
    }
    public Integer getParameterGroupType() {
        return this.parameterGroupType;
    }

    public DescribeLakebaseMountParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLakebaseMountParameterGroupResponseBodyParameterDetail extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_increment_offset</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeLakebaseMountParameterGroupResponseBodyParameterDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLakebaseMountParameterGroupResponseBodyParameterDetail self = new DescribeLakebaseMountParameterGroupResponseBodyParameterDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLakebaseMountParameterGroupResponseBodyParameterDetail setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeLakebaseMountParameterGroupResponseBodyParameterDetail setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
