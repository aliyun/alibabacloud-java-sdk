// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ExportDataReflowDataListRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("StartTime")
    public Long startTime;

    public static ExportDataReflowDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDataReflowDataListRequest self = new ExportDataReflowDataListRequest();
        return TeaModel.build(map, self);
    }

    public ExportDataReflowDataListRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ExportDataReflowDataListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ExportDataReflowDataListRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ExportDataReflowDataListRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ExportDataReflowDataListRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public ExportDataReflowDataListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
