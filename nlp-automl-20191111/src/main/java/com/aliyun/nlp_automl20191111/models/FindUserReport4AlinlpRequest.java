// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class FindUserReport4AlinlpRequest extends TeaModel {
    @NameInMap("BeginTime")
    public String beginTime;

    @NameInMap("CustomerUserParentId")
    public Long customerUserParentId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("Type")
    public String type;

    public static FindUserReport4AlinlpRequest build(java.util.Map<String, ?> map) throws Exception {
        FindUserReport4AlinlpRequest self = new FindUserReport4AlinlpRequest();
        return TeaModel.build(map, self);
    }

    public FindUserReport4AlinlpRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public FindUserReport4AlinlpRequest setCustomerUserParentId(Long customerUserParentId) {
        this.customerUserParentId = customerUserParentId;
        return this;
    }
    public Long getCustomerUserParentId() {
        return this.customerUserParentId;
    }

    public FindUserReport4AlinlpRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public FindUserReport4AlinlpRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public FindUserReport4AlinlpRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
