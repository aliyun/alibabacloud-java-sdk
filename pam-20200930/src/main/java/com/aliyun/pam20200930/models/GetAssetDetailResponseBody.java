// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GetAssetDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AssetDetail")
    public GetAssetDetailResponseBodyAssetDetail assetDetail;

    public static GetAssetDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetDetailResponseBody self = new GetAssetDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssetDetailResponseBody setAssetDetail(GetAssetDetailResponseBodyAssetDetail assetDetail) {
        this.assetDetail = assetDetail;
        return this;
    }
    public GetAssetDetailResponseBodyAssetDetail getAssetDetail() {
        return this.assetDetail;
    }

    public static class GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos extends TeaModel {
        @NameInMap("CredentialName")
        public String credentialName;

        @NameInMap("Description")
        public String description;

        @NameInMap("CredentialType")
        public String credentialType;

        public static GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos build(java.util.Map<String, ?> map) throws Exception {
            GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos self = new GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos();
            return TeaModel.build(map, self);
        }

        public GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos setCredentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }
        public String getCredentialName() {
            return this.credentialName;
        }

        public GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

    }

    public static class GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos extends TeaModel {
        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("Port")
        public Integer port;

        public static GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos build(java.util.Map<String, ?> map) throws Exception {
            GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos self = new GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos();
            return TeaModel.build(map, self);
        }

        public GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class GetAssetDetailResponseBodyAssetDetailAssetAddressInfos extends TeaModel {
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("AddressType")
        public String addressType;

        public static GetAssetDetailResponseBodyAssetDetailAssetAddressInfos build(java.util.Map<String, ?> map) throws Exception {
            GetAssetDetailResponseBodyAssetDetailAssetAddressInfos self = new GetAssetDetailResponseBodyAssetDetailAssetAddressInfos();
            return TeaModel.build(map, self);
        }

        public GetAssetDetailResponseBodyAssetDetailAssetAddressInfos setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public GetAssetDetailResponseBodyAssetDetailAssetAddressInfos setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetAssetDetailResponseBodyAssetDetailAssetAddressInfos setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

    }

    public static class GetAssetDetailResponseBodyAssetDetail extends TeaModel {
        @NameInMap("AssetThirdId")
        public String assetThirdId;

        @NameInMap("AssetUuid")
        public String assetUuid;

        @NameInMap("AssetCredentialInfos")
        public java.util.List<GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos> assetCredentialInfos;

        @NameInMap("AssetSource")
        public String assetSource;

        @NameInMap("RegisteredStatus")
        public String registeredStatus;

        @NameInMap("AssetProtocolInfos")
        public java.util.List<GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos> assetProtocolInfos;

        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("AssetRegionId")
        public String assetRegionId;

        @NameInMap("AssetRunningStatus")
        public String assetRunningStatus;

        @NameInMap("AssetFingerprint")
        public String assetFingerprint;

        @NameInMap("AssetAddressInfos")
        public java.util.List<GetAssetDetailResponseBodyAssetDetailAssetAddressInfos> assetAddressInfos;

        @NameInMap("Description")
        public String description;

        @NameInMap("AssetGroupName")
        public String assetGroupName;

        @NameInMap("SupportedRegister")
        public Boolean supportedRegister;

        public static GetAssetDetailResponseBodyAssetDetail build(java.util.Map<String, ?> map) throws Exception {
            GetAssetDetailResponseBodyAssetDetail self = new GetAssetDetailResponseBodyAssetDetail();
            return TeaModel.build(map, self);
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetThirdId(String assetThirdId) {
            this.assetThirdId = assetThirdId;
            return this;
        }
        public String getAssetThirdId() {
            return this.assetThirdId;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetUuid(String assetUuid) {
            this.assetUuid = assetUuid;
            return this;
        }
        public String getAssetUuid() {
            return this.assetUuid;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetCredentialInfos(java.util.List<GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos> assetCredentialInfos) {
            this.assetCredentialInfos = assetCredentialInfos;
            return this;
        }
        public java.util.List<GetAssetDetailResponseBodyAssetDetailAssetCredentialInfos> getAssetCredentialInfos() {
            return this.assetCredentialInfos;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetSource(String assetSource) {
            this.assetSource = assetSource;
            return this;
        }
        public String getAssetSource() {
            return this.assetSource;
        }

        public GetAssetDetailResponseBodyAssetDetail setRegisteredStatus(String registeredStatus) {
            this.registeredStatus = registeredStatus;
            return this;
        }
        public String getRegisteredStatus() {
            return this.registeredStatus;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetProtocolInfos(java.util.List<GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos> assetProtocolInfos) {
            this.assetProtocolInfos = assetProtocolInfos;
            return this;
        }
        public java.util.List<GetAssetDetailResponseBodyAssetDetailAssetProtocolInfos> getAssetProtocolInfos() {
            return this.assetProtocolInfos;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetRegionId(String assetRegionId) {
            this.assetRegionId = assetRegionId;
            return this;
        }
        public String getAssetRegionId() {
            return this.assetRegionId;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetRunningStatus(String assetRunningStatus) {
            this.assetRunningStatus = assetRunningStatus;
            return this;
        }
        public String getAssetRunningStatus() {
            return this.assetRunningStatus;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetFingerprint(String assetFingerprint) {
            this.assetFingerprint = assetFingerprint;
            return this;
        }
        public String getAssetFingerprint() {
            return this.assetFingerprint;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetAddressInfos(java.util.List<GetAssetDetailResponseBodyAssetDetailAssetAddressInfos> assetAddressInfos) {
            this.assetAddressInfos = assetAddressInfos;
            return this;
        }
        public java.util.List<GetAssetDetailResponseBodyAssetDetailAssetAddressInfos> getAssetAddressInfos() {
            return this.assetAddressInfos;
        }

        public GetAssetDetailResponseBodyAssetDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAssetDetailResponseBodyAssetDetail setAssetGroupName(String assetGroupName) {
            this.assetGroupName = assetGroupName;
            return this;
        }
        public String getAssetGroupName() {
            return this.assetGroupName;
        }

        public GetAssetDetailResponseBodyAssetDetail setSupportedRegister(Boolean supportedRegister) {
            this.supportedRegister = supportedRegister;
            return this;
        }
        public Boolean getSupportedRegister() {
            return this.supportedRegister;
        }

    }

}
