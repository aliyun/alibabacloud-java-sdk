// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetDataMaskingColumnCountRequest extends TeaModel {
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
     * <p>The list of cloud product type identifiers. Separate multiple values with commas (,). For column encryption scenarios, the values correspond to 5 (ApsaraDB RDS), 8 (PolarDB), and 27 (PolarDB-X).</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductIds")
    public String productIds;

    /**
     * <p>The data classification template ID. You can obtain the ID from the Items[].Id parameter in the ListTemplates response. The ID must be consistent with the selected sensitivity level and detection model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static GetDataMaskingColumnCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataMaskingColumnCountRequest self = new GetDataMaskingColumnCountRequest();
        return TeaModel.build(map, self);
    }

    public GetDataMaskingColumnCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetDataMaskingColumnCountRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

    public GetDataMaskingColumnCountRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
