// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleApiRequest extends TeaModel {
    /**
     * <p>Same as input parameter</p>
     * 
     * <strong>example:</strong>
     * <p>ip/accountID</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>Specific data value</p>
     * 
     * <strong>example:</strong>
     * <p>同参数</p>
     */
    @NameInMap("DataValue")
    public String dataValue;

    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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

    /**
     * <p>regionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Sample batch type</p>
     * 
     * <strong>example:</strong>
     * <p>白名单/黑名单/混合</p>
     */
    @NameInMap("SampleBatchType")
    public String sampleBatchType;

    /**
     * <p>Service list.</p>
     * 
     * <strong>example:</strong>
     * <p>同参数</p>
     */
    @NameInMap("ServiceList")
    public String serviceList;

    public static CreateSampleApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleApiRequest self = new CreateSampleApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateSampleApiRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateSampleApiRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public CreateSampleApiRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSampleApiRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateSampleApiRequest setSampleBatchType(String sampleBatchType) {
        this.sampleBatchType = sampleBatchType;
        return this;
    }
    public String getSampleBatchType() {
        return this.sampleBatchType;
    }

    public CreateSampleApiRequest setServiceList(String serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public String getServiceList() {
        return this.serviceList;
    }

}
