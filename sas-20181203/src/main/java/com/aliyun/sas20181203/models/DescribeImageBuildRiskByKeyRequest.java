// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBuildRiskByKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>a910053dd4710173ecc9e9d8931f****</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>no_user</p>
     */
    @NameInMap("RiskKey")
    public String riskKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeImageBuildRiskByKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBuildRiskByKeyRequest self = new DescribeImageBuildRiskByKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageBuildRiskByKeyRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageBuildRiskByKeyRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageBuildRiskByKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageBuildRiskByKeyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageBuildRiskByKeyRequest setRiskKey(String riskKey) {
        this.riskKey = riskKey;
        return this;
    }
    public String getRiskKey() {
        return this.riskKey;
    }

    public DescribeImageBuildRiskByKeyRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
