// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class InnerCreateSandboxVolumeMounts extends TeaModel {
    @NameInMap("agenticFs")
    public InnerCreateSandboxVolumeMountsAgenticFs agenticFs;

    @NameInMap("named")
    public InnerCreateSandboxVolumeMountsNamed named;

    @NameInMap("oss")
    public InnerCreateSandboxVolumeMountsOss oss;

    public static InnerCreateSandboxVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
        InnerCreateSandboxVolumeMounts self = new InnerCreateSandboxVolumeMounts();
        return TeaModel.build(map, self);
    }

    public InnerCreateSandboxVolumeMounts setAgenticFs(InnerCreateSandboxVolumeMountsAgenticFs agenticFs) {
        this.agenticFs = agenticFs;
        return this;
    }
    public InnerCreateSandboxVolumeMountsAgenticFs getAgenticFs() {
        return this.agenticFs;
    }

    public InnerCreateSandboxVolumeMounts setNamed(InnerCreateSandboxVolumeMountsNamed named) {
        this.named = named;
        return this;
    }
    public InnerCreateSandboxVolumeMountsNamed getNamed() {
        return this.named;
    }

    public InnerCreateSandboxVolumeMounts setOss(InnerCreateSandboxVolumeMountsOss oss) {
        this.oss = oss;
        return this;
    }
    public InnerCreateSandboxVolumeMountsOss getOss() {
        return this.oss;
    }

    public static class InnerCreateSandboxVolumeMountsAgenticFsMountPoints extends TeaModel {
        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("serverAddr")
        public String serverAddr;

        public static InnerCreateSandboxVolumeMountsAgenticFsMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsAgenticFsMountPoints self = new InnerCreateSandboxVolumeMountsAgenticFsMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsAgenticFsMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerCreateSandboxVolumeMountsAgenticFsMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class InnerCreateSandboxVolumeMountsAgenticFs extends TeaModel {
        @NameInMap("groupID")
        public Integer groupID;

        @NameInMap("mountPoints")
        public java.util.List<InnerCreateSandboxVolumeMountsAgenticFsMountPoints> mountPoints;

        @NameInMap("userID")
        public Integer userID;

        public static InnerCreateSandboxVolumeMountsAgenticFs build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsAgenticFs self = new InnerCreateSandboxVolumeMountsAgenticFs();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsAgenticFs setGroupID(Integer groupID) {
            this.groupID = groupID;
            return this;
        }
        public Integer getGroupID() {
            return this.groupID;
        }

        public InnerCreateSandboxVolumeMountsAgenticFs setMountPoints(java.util.List<InnerCreateSandboxVolumeMountsAgenticFsMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerCreateSandboxVolumeMountsAgenticFsMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public InnerCreateSandboxVolumeMountsAgenticFs setUserID(Integer userID) {
            this.userID = userID;
            return this;
        }
        public Integer getUserID() {
            return this.userID;
        }

    }

    public static class InnerCreateSandboxVolumeMountsNamedMountPoints extends TeaModel {
        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("volumeName")
        public String volumeName;

        public static InnerCreateSandboxVolumeMountsNamedMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsNamedMountPoints self = new InnerCreateSandboxVolumeMountsNamedMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsNamedMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerCreateSandboxVolumeMountsNamedMountPoints setVolumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public String getVolumeName() {
            return this.volumeName;
        }

    }

    public static class InnerCreateSandboxVolumeMountsNamed extends TeaModel {
        @NameInMap("mountPoints")
        public java.util.List<InnerCreateSandboxVolumeMountsNamedMountPoints> mountPoints;

        public static InnerCreateSandboxVolumeMountsNamed build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsNamed self = new InnerCreateSandboxVolumeMountsNamed();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsNamed setMountPoints(java.util.List<InnerCreateSandboxVolumeMountsNamedMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerCreateSandboxVolumeMountsNamedMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class InnerCreateSandboxVolumeMountsOssMountPoints extends TeaModel {
        @NameInMap("bucketName")
        public String bucketName;

        @NameInMap("bucketPath")
        public String bucketPath;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("readOnly")
        public Boolean readOnly;

        public static InnerCreateSandboxVolumeMountsOssMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsOssMountPoints self = new InnerCreateSandboxVolumeMountsOssMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class InnerCreateSandboxVolumeMountsOss extends TeaModel {
        @NameInMap("mountPoints")
        public java.util.List<InnerCreateSandboxVolumeMountsOssMountPoints> mountPoints;

        public static InnerCreateSandboxVolumeMountsOss build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsOss self = new InnerCreateSandboxVolumeMountsOss();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsOss setMountPoints(java.util.List<InnerCreateSandboxVolumeMountsOssMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerCreateSandboxVolumeMountsOssMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

}
