// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetNotaryOrderResponseBody extends TeaModel {
    @NameInMap("AliyunOrderId")
    public String aliyunOrderId;

    @NameInMap("ApplyPostStatus")
    public Integer applyPostStatus;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BusinessLicense")
    public String businessLicense;

    @NameInMap("BusinessLicenseId")
    public String businessLicenseId;

    @NameInMap("CompanyContactName")
    public String companyContactName;

    @NameInMap("CompanyContactPhone")
    public String companyContactPhone;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("LegalPersonIdCard")
    public String legalPersonIdCard;

    @NameInMap("LegalPersonName")
    public String legalPersonName;

    @NameInMap("LegalPersonPhone")
    public String legalPersonPhone;

    @NameInMap("Name")
    public String name;

    @NameInMap("NotaryAcceptDate")
    public Long notaryAcceptDate;

    @NameInMap("NotaryCertificate")
    public String notaryCertificate;

    @NameInMap("NotaryFailedDate")
    public Long notaryFailedDate;

    @NameInMap("NotaryFailedReason")
    public String notaryFailedReason;

    @NameInMap("NotaryOrderId")
    public Long notaryOrderId;

    @NameInMap("NotaryPlatformName")
    public String notaryPlatformName;

    @NameInMap("NotaryPostReceipt")
    public String notaryPostReceipt;

    @NameInMap("NotaryStatus")
    public Integer notaryStatus;

    @NameInMap("NotarySucceedDate")
    public Long notarySucceedDate;

    @NameInMap("NotaryType")
    public Integer notaryType;

    @NameInMap("OrderDate")
    public Long orderDate;

    @NameInMap("OrderPrice")
    public Float orderPrice;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("ReceiverAddress")
    public String receiverAddress;

    @NameInMap("ReceiverName")
    public String receiverName;

    @NameInMap("ReceiverPhone")
    public String receiverPhone;

    @NameInMap("ReceiverPostalCode")
    public String receiverPostalCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SellerBackOfIdCard")
    public String sellerBackOfIdCard;

    @NameInMap("SellerCompanyName")
    public String sellerCompanyName;

    @NameInMap("SellerFrontOfIdCard")
    public String sellerFrontOfIdCard;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TmAcceptCertificate")
    public String tmAcceptCertificate;

    @NameInMap("TmClassification")
    public String tmClassification;

    @NameInMap("TmImage")
    public String tmImage;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmRegisterCertificate")
    public String tmRegisterCertificate;

    @NameInMap("TmRegisterChangeCertificate")
    public String tmRegisterChangeCertificate;

    @NameInMap("TmRegisterNo")
    public String tmRegisterNo;

    @NameInMap("Type")
    public String type;

    public static GetNotaryOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNotaryOrderResponseBody self = new GetNotaryOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNotaryOrderResponseBody setAliyunOrderId(String aliyunOrderId) {
        this.aliyunOrderId = aliyunOrderId;
        return this;
    }
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    public GetNotaryOrderResponseBody setApplyPostStatus(Integer applyPostStatus) {
        this.applyPostStatus = applyPostStatus;
        return this;
    }
    public Integer getApplyPostStatus() {
        return this.applyPostStatus;
    }

    public GetNotaryOrderResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetNotaryOrderResponseBody setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
        return this;
    }
    public String getBusinessLicense() {
        return this.businessLicense;
    }

    public GetNotaryOrderResponseBody setBusinessLicenseId(String businessLicenseId) {
        this.businessLicenseId = businessLicenseId;
        return this;
    }
    public String getBusinessLicenseId() {
        return this.businessLicenseId;
    }

    public GetNotaryOrderResponseBody setCompanyContactName(String companyContactName) {
        this.companyContactName = companyContactName;
        return this;
    }
    public String getCompanyContactName() {
        return this.companyContactName;
    }

    public GetNotaryOrderResponseBody setCompanyContactPhone(String companyContactPhone) {
        this.companyContactPhone = companyContactPhone;
        return this;
    }
    public String getCompanyContactPhone() {
        return this.companyContactPhone;
    }

    public GetNotaryOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNotaryOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetNotaryOrderResponseBody setLegalPersonIdCard(String legalPersonIdCard) {
        this.legalPersonIdCard = legalPersonIdCard;
        return this;
    }
    public String getLegalPersonIdCard() {
        return this.legalPersonIdCard;
    }

    public GetNotaryOrderResponseBody setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public GetNotaryOrderResponseBody setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone;
        return this;
    }
    public String getLegalPersonPhone() {
        return this.legalPersonPhone;
    }

    public GetNotaryOrderResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetNotaryOrderResponseBody setNotaryAcceptDate(Long notaryAcceptDate) {
        this.notaryAcceptDate = notaryAcceptDate;
        return this;
    }
    public Long getNotaryAcceptDate() {
        return this.notaryAcceptDate;
    }

    public GetNotaryOrderResponseBody setNotaryCertificate(String notaryCertificate) {
        this.notaryCertificate = notaryCertificate;
        return this;
    }
    public String getNotaryCertificate() {
        return this.notaryCertificate;
    }

    public GetNotaryOrderResponseBody setNotaryFailedDate(Long notaryFailedDate) {
        this.notaryFailedDate = notaryFailedDate;
        return this;
    }
    public Long getNotaryFailedDate() {
        return this.notaryFailedDate;
    }

    public GetNotaryOrderResponseBody setNotaryFailedReason(String notaryFailedReason) {
        this.notaryFailedReason = notaryFailedReason;
        return this;
    }
    public String getNotaryFailedReason() {
        return this.notaryFailedReason;
    }

    public GetNotaryOrderResponseBody setNotaryOrderId(Long notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public Long getNotaryOrderId() {
        return this.notaryOrderId;
    }

    public GetNotaryOrderResponseBody setNotaryPlatformName(String notaryPlatformName) {
        this.notaryPlatformName = notaryPlatformName;
        return this;
    }
    public String getNotaryPlatformName() {
        return this.notaryPlatformName;
    }

    public GetNotaryOrderResponseBody setNotaryPostReceipt(String notaryPostReceipt) {
        this.notaryPostReceipt = notaryPostReceipt;
        return this;
    }
    public String getNotaryPostReceipt() {
        return this.notaryPostReceipt;
    }

    public GetNotaryOrderResponseBody setNotaryStatus(Integer notaryStatus) {
        this.notaryStatus = notaryStatus;
        return this;
    }
    public Integer getNotaryStatus() {
        return this.notaryStatus;
    }

    public GetNotaryOrderResponseBody setNotarySucceedDate(Long notarySucceedDate) {
        this.notarySucceedDate = notarySucceedDate;
        return this;
    }
    public Long getNotarySucceedDate() {
        return this.notarySucceedDate;
    }

    public GetNotaryOrderResponseBody setNotaryType(Integer notaryType) {
        this.notaryType = notaryType;
        return this;
    }
    public Integer getNotaryType() {
        return this.notaryType;
    }

    public GetNotaryOrderResponseBody setOrderDate(Long orderDate) {
        this.orderDate = orderDate;
        return this;
    }
    public Long getOrderDate() {
        return this.orderDate;
    }

    public GetNotaryOrderResponseBody setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Float getOrderPrice() {
        return this.orderPrice;
    }

    public GetNotaryOrderResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetNotaryOrderResponseBody setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }
    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public GetNotaryOrderResponseBody setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

    public GetNotaryOrderResponseBody setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
        return this;
    }
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public GetNotaryOrderResponseBody setReceiverPostalCode(String receiverPostalCode) {
        this.receiverPostalCode = receiverPostalCode;
        return this;
    }
    public String getReceiverPostalCode() {
        return this.receiverPostalCode;
    }

    public GetNotaryOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNotaryOrderResponseBody setSellerBackOfIdCard(String sellerBackOfIdCard) {
        this.sellerBackOfIdCard = sellerBackOfIdCard;
        return this;
    }
    public String getSellerBackOfIdCard() {
        return this.sellerBackOfIdCard;
    }

    public GetNotaryOrderResponseBody setSellerCompanyName(String sellerCompanyName) {
        this.sellerCompanyName = sellerCompanyName;
        return this;
    }
    public String getSellerCompanyName() {
        return this.sellerCompanyName;
    }

    public GetNotaryOrderResponseBody setSellerFrontOfIdCard(String sellerFrontOfIdCard) {
        this.sellerFrontOfIdCard = sellerFrontOfIdCard;
        return this;
    }
    public String getSellerFrontOfIdCard() {
        return this.sellerFrontOfIdCard;
    }

    public GetNotaryOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetNotaryOrderResponseBody setTmAcceptCertificate(String tmAcceptCertificate) {
        this.tmAcceptCertificate = tmAcceptCertificate;
        return this;
    }
    public String getTmAcceptCertificate() {
        return this.tmAcceptCertificate;
    }

    public GetNotaryOrderResponseBody setTmClassification(String tmClassification) {
        this.tmClassification = tmClassification;
        return this;
    }
    public String getTmClassification() {
        return this.tmClassification;
    }

    public GetNotaryOrderResponseBody setTmImage(String tmImage) {
        this.tmImage = tmImage;
        return this;
    }
    public String getTmImage() {
        return this.tmImage;
    }

    public GetNotaryOrderResponseBody setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public GetNotaryOrderResponseBody setTmRegisterCertificate(String tmRegisterCertificate) {
        this.tmRegisterCertificate = tmRegisterCertificate;
        return this;
    }
    public String getTmRegisterCertificate() {
        return this.tmRegisterCertificate;
    }

    public GetNotaryOrderResponseBody setTmRegisterChangeCertificate(String tmRegisterChangeCertificate) {
        this.tmRegisterChangeCertificate = tmRegisterChangeCertificate;
        return this;
    }
    public String getTmRegisterChangeCertificate() {
        return this.tmRegisterChangeCertificate;
    }

    public GetNotaryOrderResponseBody setTmRegisterNo(String tmRegisterNo) {
        this.tmRegisterNo = tmRegisterNo;
        return this;
    }
    public String getTmRegisterNo() {
        return this.tmRegisterNo;
    }

    public GetNotaryOrderResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
