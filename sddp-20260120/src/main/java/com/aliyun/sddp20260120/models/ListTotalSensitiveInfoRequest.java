// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListTotalSensitiveInfoRequest extends TeaModel {
    /**
     * <p>The statistics scenario. Valid values:</p>
     * <ul>
     * <li>41: overview.</li>
     * <li>42: data catalog statistics by product.</li>
     * <li>43: region and template summary by product.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("CountType")
    public Integer countType;

    /**
     * <p>The language of the response description. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The code of the cloud service. Column encryption supports RDS, POLARDB, and PolarDBX2. If you also specify ProductId, the two values must correspond to each other.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Multiple product codes separated by commas (,). This parameter is used when CountType is set to 43 and ProductCode is not specified. The results are merged by region and template.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS,POLARDB,PolarDBX2</p>
     */
    @NameInMap("ProductCodeList")
    public String productCodeList;

    /**
     * <p>The ID of the data classification template. You can obtain this value from Items[].Id in the response of the ListTemplates operation. The value must be consistent with the selected sensitivity level and detection model.</p>
     * 
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
