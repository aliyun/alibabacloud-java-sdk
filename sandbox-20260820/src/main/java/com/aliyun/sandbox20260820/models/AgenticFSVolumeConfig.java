// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class AgenticFSVolumeConfig extends TeaModel {
    @NameInMap("accessPointID")
    public String accessPointID;

    @NameInMap("agenticSpaceID")
    public String agenticSpaceID;

    @NameInMap("fileSystemID")
    public String fileSystemID;

    @NameInMap("groupID")
    public Integer groupID;

    @NameInMap("serverAddr")
    public String serverAddr;

    @NameInMap("userID")
    public Integer userID;

    public static AgenticFSVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
        AgenticFSVolumeConfig self = new AgenticFSVolumeConfig();
        return TeaModel.build(map, self);
    }

    public AgenticFSVolumeConfig setAccessPointID(String accessPointID) {
        this.accessPointID = accessPointID;
        return this;
    }
    public String getAccessPointID() {
        return this.accessPointID;
    }

    public AgenticFSVolumeConfig setAgenticSpaceID(String agenticSpaceID) {
        this.agenticSpaceID = agenticSpaceID;
        return this;
    }
    public String getAgenticSpaceID() {
        return this.agenticSpaceID;
    }

    public AgenticFSVolumeConfig setFileSystemID(String fileSystemID) {
        this.fileSystemID = fileSystemID;
        return this;
    }
    public String getFileSystemID() {
        return this.fileSystemID;
    }

    public AgenticFSVolumeConfig setGroupID(Integer groupID) {
        this.groupID = groupID;
        return this;
    }
    public Integer getGroupID() {
        return this.groupID;
    }

    public AgenticFSVolumeConfig setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
        return this;
    }
    public String getServerAddr() {
        return this.serverAddr;
    }

    public AgenticFSVolumeConfig setUserID(Integer userID) {
        this.userID = userID;
        return this;
    }
    public Integer getUserID() {
        return this.userID;
    }

}
