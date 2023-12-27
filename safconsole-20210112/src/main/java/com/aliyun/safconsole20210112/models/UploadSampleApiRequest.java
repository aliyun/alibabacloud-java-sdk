// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class UploadSampleApiRequest extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DataValue")
    public String dataValue;

    @NameInMap("SampleType")
    public String sampleType;

    @NameInMap("Service")
    public String service;

    public static UploadSampleApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSampleApiRequest self = new UploadSampleApiRequest();
        return TeaModel.build(map, self);
    }

    public UploadSampleApiRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public UploadSampleApiRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public UploadSampleApiRequest setSampleType(String sampleType) {
        this.sampleType = sampleType;
        return this;
    }
    public String getSampleType() {
        return this.sampleType;
    }

    public UploadSampleApiRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
