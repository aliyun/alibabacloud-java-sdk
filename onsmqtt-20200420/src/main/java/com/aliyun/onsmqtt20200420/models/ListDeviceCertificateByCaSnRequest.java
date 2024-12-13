// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCertificateByCaSnRequest extends TeaModel {
    /**
     * <p>The SN serial number of the CA certificate to be queried, indicating which CA certificate\&quot;s registered device certificates are to be retrieved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("CaSn")
    public String caSn;

    /**
     * <p>The instance ID bound to the CA certificate, which is the instance ID of the MQTT version of the cloud message queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>Indicates the page number of the returned results. The starting page is counted from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The maximum number of query records to display per page. Value range: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
