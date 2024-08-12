// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddDevicesFromCSVRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public Integer fileType;

    @NameInMap("SeatCol")
    public Integer seatCol;

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("SiteName")
    public String siteName;

    public static AddDevicesFromCSVRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDevicesFromCSVRequest self = new AddDevicesFromCSVRequest();
        return TeaModel.build(map, self);
    }

    public AddDevicesFromCSVRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AddDevicesFromCSVRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public AddDevicesFromCSVRequest setSeatCol(Integer seatCol) {
        this.seatCol = seatCol;
        return this;
    }
    public Integer getSeatCol() {
        return this.seatCol;
    }

    public AddDevicesFromCSVRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public AddDevicesFromCSVRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
