// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCertificateByCaSnRequest extends TeaModel {
    @NameInMap("CaSn")
    public String caSn;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListDeviceCertificateByCaSnRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceCertificateByCaSnRequest self = new ListDeviceCertificateByCaSnRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceCertificateByCaSnRequest setCaSn(String caSn) {
        this.caSn = caSn;
        return this;
    }
    public String getCaSn() {
        return this.caSn;
    }

    public ListDeviceCertificateByCaSnRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public ListDeviceCertificateByCaSnRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListDeviceCertificateByCaSnRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
