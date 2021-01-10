// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RecognizeODPSchemasRequest extends TeaModel {
    @NameInMap("DbnodeListRepeatList")
    public java.util.List<String> dbnodeListRepeatList;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static RecognizeODPSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeODPSchemasRequest self = new RecognizeODPSchemasRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeODPSchemasRequest setDbnodeListRepeatList(java.util.List<String> dbnodeListRepeatList) {
        this.dbnodeListRepeatList = dbnodeListRepeatList;
        return this;
    }
    public java.util.List<String> getDbnodeListRepeatList() {
        return this.dbnodeListRepeatList;
    }

    public RecognizeODPSchemasRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public RecognizeODPSchemasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RecognizeODPSchemasRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
