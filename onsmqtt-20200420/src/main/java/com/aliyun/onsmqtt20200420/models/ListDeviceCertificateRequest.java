// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCertificateRequest extends TeaModel {
    /**
     * <p>The instance ID of the Cloud Message Queue MQTT version, indicating which instance\&quot;s device certificates need to be viewed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>Indicates which page of the results to return. The starting page is counted from 1.</p>
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

    public static ListDeviceCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceCertificateRequest self = new ListDeviceCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public ListDeviceCertificateRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListDeviceCertificateRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
