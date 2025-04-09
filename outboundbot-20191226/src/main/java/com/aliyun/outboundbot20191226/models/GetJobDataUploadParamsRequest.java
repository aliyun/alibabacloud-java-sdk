// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetJobDataUploadParamsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SCRIPT_RECORDING</p>
     */
    @NameInMap("BusiType")
    public String busiType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4eee9bf8-1319-468f-ac82-83c50ae389f8</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>//airwaybill/1237185904146124802</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>sas_siema_1477832102462645_siem_f07e90c2c147cf8cf1549ccb974e1956</p>
     */
    @NameInMap("UniqueId")
    public String uniqueId;

    public static GetJobDataUploadParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobDataUploadParamsRequest self = new GetJobDataUploadParamsRequest();
        return TeaModel.build(map, self);
    }

    public GetJobDataUploadParamsRequest setBusiType(String busiType) {
        this.busiType = busiType;
        return this;
    }
    public String getBusiType() {
        return this.busiType;
    }

    public GetJobDataUploadParamsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetJobDataUploadParamsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetJobDataUploadParamsRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetJobDataUploadParamsRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
