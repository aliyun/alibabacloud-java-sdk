// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListTotalSensitiveInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("CountType")
    public Integer countType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>RDS,POLARDB,PolarDBX2</p>
     */
    @NameInMap("ProductCodeList")
    public String productCodeList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ListTotalSensitiveInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTotalSensitiveInfoRequest self = new ListTotalSensitiveInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListTotalSensitiveInfoRequest setCountType(Integer countType) {
        this.countType = countType;
        return this;
    }
    public Integer getCountType() {
        return this.countType;
    }

    public ListTotalSensitiveInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTotalSensitiveInfoRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListTotalSensitiveInfoRequest setProductCodeList(String productCodeList) {
        this.productCodeList = productCodeList;
        return this;
    }
    public String getProductCodeList() {
        return this.productCodeList;
    }

    public ListTotalSensitiveInfoRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
