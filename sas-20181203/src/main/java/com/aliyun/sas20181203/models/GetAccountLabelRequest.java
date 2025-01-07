// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAccountLabelRequest extends TeaModel {
    /**
     * <p>The tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LabelList")
    public java.util.List<String> labelList;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static GetAccountLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountLabelRequest self = new GetAccountLabelRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountLabelRequest setLabelList(java.util.List<String> labelList) {
        this.labelList = labelList;
        return this;
    }
    public java.util.List<String> getLabelList() {
        return this.labelList;
    }

    public GetAccountLabelRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
