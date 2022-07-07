// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListCaCertificateRequest extends TeaModel {
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCaCertificateRequest self = new ListCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ListCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public ListCaCertificateRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListCaCertificateRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
