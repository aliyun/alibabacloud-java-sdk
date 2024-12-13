// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListCaCertificateRequest extends TeaModel {
    /**
     * <p>The instance ID of the Cloud Message Queue MQTT version, indicating which instance\&quot;s CA certificates need to be viewed.</p>
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
