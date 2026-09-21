// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class AgenticFSVolumeConfig extends TeaModel {
    /**
     * <p>The access point ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-xxxx</p>
     */
    @NameInMap("accessPointID")
    public String accessPointID;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agentic-xxxx</p>
     */
    @NameInMap("agenticSpaceID")
    public String agenticSpaceID;

    /**
     * <p>The file system ID.</p>
     * 
     * <strong>example:</strong>
     * <p>03204sl2qjiax4ocdt2</p>
     */
    @NameInMap("fileSystemID")
    public String fileSystemID;

    /**
     * <p>The group ID for local mounting.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("groupID")
    public Integer groupID;

    /**
     * <p>The AgenticFS access point address.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-xxxx.03204sl2qjiax4ocdt2-ljs60.cn-shanghai.nas.aliyuncs.com</p>
     */
    @NameInMap("serverAddr")
    public String serverAddr;

    /**
     * <p>The user ID for local mounting.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
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
