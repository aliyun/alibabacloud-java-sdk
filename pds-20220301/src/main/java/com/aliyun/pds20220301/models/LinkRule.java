// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class LinkRule extends TeaModel {
    @NameInMap("link_type")
    public String linkType;

    @NameInMap("src_drive_id")
    public String srcDriveId;

    @NameInMap("src_drive_name")
    public String srcDriveName;

    @NameInMap("src_file_id")
    public String srcFileId;

    @NameInMap("src_file_name")
    public String srcFileName;

    @NameInMap("src_valid")
    public Boolean srcValid;

    public static LinkRule build(java.util.Map<String, ?> map) throws Exception {
        LinkRule self = new LinkRule();
        return TeaModel.build(map, self);
    }

    public LinkRule setLinkType(String linkType) {
        this.linkType = linkType;
        return this;
    }
    public String getLinkType() {
        return this.linkType;
    }

    public LinkRule setSrcDriveId(String srcDriveId) {
        this.srcDriveId = srcDriveId;
        return this;
    }
    public String getSrcDriveId() {
        return this.srcDriveId;
    }

    public LinkRule setSrcDriveName(String srcDriveName) {
        this.srcDriveName = srcDriveName;
        return this;
    }
    public String getSrcDriveName() {
        return this.srcDriveName;
    }

    public LinkRule setSrcFileId(String srcFileId) {
        this.srcFileId = srcFileId;
        return this;
    }
    public String getSrcFileId() {
        return this.srcFileId;
    }

    public LinkRule setSrcFileName(String srcFileName) {
        this.srcFileName = srcFileName;
        return this;
    }
    public String getSrcFileName() {
        return this.srcFileName;
    }

    public LinkRule setSrcValid(Boolean srcValid) {
        this.srcValid = srcValid;
        return this;
    }
    public Boolean getSrcValid() {
        return this.srcValid;
    }

}
