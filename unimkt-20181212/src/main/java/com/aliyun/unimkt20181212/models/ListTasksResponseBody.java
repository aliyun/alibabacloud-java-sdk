// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListTasksResponseBodyData data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListTasksResponseBody setData(ListTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTasksResponseBodyData getData() {
        return this.data;
    }

    public ListTasksResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTasksResponseBodyDataListActualBankRegisterVO extends TeaModel {
        @NameInMap("InComingPartsNumber")
        public Long inComingPartsNumber;

        @NameInMap("PlaceOrderNumber")
        public Long placeOrderNumber;

        @NameInMap("SwipingCardNumber")
        public Long swipingCardNumber;

        @NameInMap("VerificationCardNumber")
        public Long verificationCardNumber;

        @NameInMap("VisaInterviewNumber")
        public Long visaInterviewNumber;

        public static ListTasksResponseBodyDataListActualBankRegisterVO build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyDataListActualBankRegisterVO self = new ListTasksResponseBodyDataListActualBankRegisterVO();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyDataListActualBankRegisterVO setInComingPartsNumber(Long inComingPartsNumber) {
            this.inComingPartsNumber = inComingPartsNumber;
            return this;
        }
        public Long getInComingPartsNumber() {
            return this.inComingPartsNumber;
        }

        public ListTasksResponseBodyDataListActualBankRegisterVO setPlaceOrderNumber(Long placeOrderNumber) {
            this.placeOrderNumber = placeOrderNumber;
            return this;
        }
        public Long getPlaceOrderNumber() {
            return this.placeOrderNumber;
        }

        public ListTasksResponseBodyDataListActualBankRegisterVO setSwipingCardNumber(Long swipingCardNumber) {
            this.swipingCardNumber = swipingCardNumber;
            return this;
        }
        public Long getSwipingCardNumber() {
            return this.swipingCardNumber;
        }

        public ListTasksResponseBodyDataListActualBankRegisterVO setVerificationCardNumber(Long verificationCardNumber) {
            this.verificationCardNumber = verificationCardNumber;
            return this;
        }
        public Long getVerificationCardNumber() {
            return this.verificationCardNumber;
        }

        public ListTasksResponseBodyDataListActualBankRegisterVO setVisaInterviewNumber(Long visaInterviewNumber) {
            this.visaInterviewNumber = visaInterviewNumber;
            return this;
        }
        public Long getVisaInterviewNumber() {
            return this.visaInterviewNumber;
        }

    }

    public static class ListTasksResponseBodyDataListPredictBankRegisterVO extends TeaModel {
        @NameInMap("InComingPartsNumber")
        public Long inComingPartsNumber;

        @NameInMap("PlaceOrderNumber")
        public Long placeOrderNumber;

        @NameInMap("SwipingCardNumber")
        public Long swipingCardNumber;

        @NameInMap("VerificationCardNumber")
        public Long verificationCardNumber;

        @NameInMap("VisaInterviewNumber")
        public Long visaInterviewNumber;

        public static ListTasksResponseBodyDataListPredictBankRegisterVO build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyDataListPredictBankRegisterVO self = new ListTasksResponseBodyDataListPredictBankRegisterVO();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyDataListPredictBankRegisterVO setInComingPartsNumber(Long inComingPartsNumber) {
            this.inComingPartsNumber = inComingPartsNumber;
            return this;
        }
        public Long getInComingPartsNumber() {
            return this.inComingPartsNumber;
        }

        public ListTasksResponseBodyDataListPredictBankRegisterVO setPlaceOrderNumber(Long placeOrderNumber) {
            this.placeOrderNumber = placeOrderNumber;
            return this;
        }
        public Long getPlaceOrderNumber() {
            return this.placeOrderNumber;
        }

        public ListTasksResponseBodyDataListPredictBankRegisterVO setSwipingCardNumber(Long swipingCardNumber) {
            this.swipingCardNumber = swipingCardNumber;
            return this;
        }
        public Long getSwipingCardNumber() {
            return this.swipingCardNumber;
        }

        public ListTasksResponseBodyDataListPredictBankRegisterVO setVerificationCardNumber(Long verificationCardNumber) {
            this.verificationCardNumber = verificationCardNumber;
            return this;
        }
        public Long getVerificationCardNumber() {
            return this.verificationCardNumber;
        }

        public ListTasksResponseBodyDataListPredictBankRegisterVO setVisaInterviewNumber(Long visaInterviewNumber) {
            this.visaInterviewNumber = visaInterviewNumber;
            return this;
        }
        public Long getVisaInterviewNumber() {
            return this.visaInterviewNumber;
        }

    }

    public static class ListTasksResponseBodyDataList extends TeaModel {
        @NameInMap("AccountNo")
        public String accountNo;

        @NameInMap("AccountStatus")
        public Long accountStatus;

        @NameInMap("ActualBankRegisterVO")
        public ListTasksResponseBodyDataListActualBankRegisterVO actualBankRegisterVO;

        @NameInMap("ActualCommonSceneVO")
        public java.util.Map<String, String> actualCommonSceneVO;

        @NameInMap("ActualConsumeAmount")
        public Long actualConsumeAmount;

        @NameInMap("ActualInfo")
        public String actualInfo;

        @NameInMap("BrandActualResultNumber")
        public Long brandActualResultNumber;

        @NameInMap("BrandPredictResultNumber")
        public Long brandPredictResultNumber;

        @NameInMap("BrandUserId")
        public Long brandUserId;

        @NameInMap("BrandUserNick")
        public String brandUserNick;

        @NameInMap("CouponNewActualResultNumber")
        public Long couponNewActualResultNumber;

        @NameInMap("CouponNewPredictResultNumber")
        public Long couponNewPredictResultNumber;

        @NameInMap("CouponNewPriceStep")
        public Long couponNewPriceStep;

        @NameInMap("CouponOldActualResultNumber")
        public Long couponOldActualResultNumber;

        @NameInMap("CouponOldPredictResultNumber")
        public Long couponOldPredictResultNumber;

        @NameInMap("CouponOldPriceStep")
        public Long couponOldPriceStep;

        @NameInMap("CurrencyType")
        public Long currencyType;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LoginActualResultNumber")
        public Long loginActualResultNumber;

        @NameInMap("LoginPredictResultNumber")
        public Long loginPredictResultNumber;

        @NameInMap("MainId")
        public Long mainId;

        @NameInMap("MainType")
        public Long mainType;

        @NameInMap("OpNick")
        public String opNick;

        @NameInMap("OrderActualResultNumber")
        public Long orderActualResultNumber;

        @NameInMap("OrderPredictResultNumber")
        public Long orderPredictResultNumber;

        @NameInMap("PredictBankRegisterVO")
        public ListTasksResponseBodyDataListPredictBankRegisterVO predictBankRegisterVO;

        @NameInMap("PredictCommonSceneVO")
        public java.util.Map<String, String> predictCommonSceneVO;

        @NameInMap("PredictConsumeAmount")
        public Long predictConsumeAmount;

        @NameInMap("PredictInfo")
        public String predictInfo;

        @NameInMap("PriceType")
        public Long priceType;

        @NameInMap("ProxyUserId")
        public Long proxyUserId;

        @NameInMap("ProxyUserNick")
        public String proxyUserNick;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("ScheduleType")
        public Long scheduleType;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Long status;

        @NameInMap("SystemActualConsumeAmount")
        public Long systemActualConsumeAmount;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("TaskGroupId")
        public Long taskGroupId;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskMarketingType")
        public Long taskMarketingType;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public String taskType;

        public static ListTasksResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyDataList self = new ListTasksResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyDataList setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        public String getAccountNo() {
            return this.accountNo;
        }

        public ListTasksResponseBodyDataList setAccountStatus(Long accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public Long getAccountStatus() {
            return this.accountStatus;
        }

        public ListTasksResponseBodyDataList setActualBankRegisterVO(ListTasksResponseBodyDataListActualBankRegisterVO actualBankRegisterVO) {
            this.actualBankRegisterVO = actualBankRegisterVO;
            return this;
        }
        public ListTasksResponseBodyDataListActualBankRegisterVO getActualBankRegisterVO() {
            return this.actualBankRegisterVO;
        }

        public ListTasksResponseBodyDataList setActualCommonSceneVO(java.util.Map<String, String> actualCommonSceneVO) {
            this.actualCommonSceneVO = actualCommonSceneVO;
            return this;
        }
        public java.util.Map<String, String> getActualCommonSceneVO() {
            return this.actualCommonSceneVO;
        }

        public ListTasksResponseBodyDataList setActualConsumeAmount(Long actualConsumeAmount) {
            this.actualConsumeAmount = actualConsumeAmount;
            return this;
        }
        public Long getActualConsumeAmount() {
            return this.actualConsumeAmount;
        }

        public ListTasksResponseBodyDataList setActualInfo(String actualInfo) {
            this.actualInfo = actualInfo;
            return this;
        }
        public String getActualInfo() {
            return this.actualInfo;
        }

        public ListTasksResponseBodyDataList setBrandActualResultNumber(Long brandActualResultNumber) {
            this.brandActualResultNumber = brandActualResultNumber;
            return this;
        }
        public Long getBrandActualResultNumber() {
            return this.brandActualResultNumber;
        }

        public ListTasksResponseBodyDataList setBrandPredictResultNumber(Long brandPredictResultNumber) {
            this.brandPredictResultNumber = brandPredictResultNumber;
            return this;
        }
        public Long getBrandPredictResultNumber() {
            return this.brandPredictResultNumber;
        }

        public ListTasksResponseBodyDataList setBrandUserId(Long brandUserId) {
            this.brandUserId = brandUserId;
            return this;
        }
        public Long getBrandUserId() {
            return this.brandUserId;
        }

        public ListTasksResponseBodyDataList setBrandUserNick(String brandUserNick) {
            this.brandUserNick = brandUserNick;
            return this;
        }
        public String getBrandUserNick() {
            return this.brandUserNick;
        }

        public ListTasksResponseBodyDataList setCouponNewActualResultNumber(Long couponNewActualResultNumber) {
            this.couponNewActualResultNumber = couponNewActualResultNumber;
            return this;
        }
        public Long getCouponNewActualResultNumber() {
            return this.couponNewActualResultNumber;
        }

        public ListTasksResponseBodyDataList setCouponNewPredictResultNumber(Long couponNewPredictResultNumber) {
            this.couponNewPredictResultNumber = couponNewPredictResultNumber;
            return this;
        }
        public Long getCouponNewPredictResultNumber() {
            return this.couponNewPredictResultNumber;
        }

        public ListTasksResponseBodyDataList setCouponNewPriceStep(Long couponNewPriceStep) {
            this.couponNewPriceStep = couponNewPriceStep;
            return this;
        }
        public Long getCouponNewPriceStep() {
            return this.couponNewPriceStep;
        }

        public ListTasksResponseBodyDataList setCouponOldActualResultNumber(Long couponOldActualResultNumber) {
            this.couponOldActualResultNumber = couponOldActualResultNumber;
            return this;
        }
        public Long getCouponOldActualResultNumber() {
            return this.couponOldActualResultNumber;
        }

        public ListTasksResponseBodyDataList setCouponOldPredictResultNumber(Long couponOldPredictResultNumber) {
            this.couponOldPredictResultNumber = couponOldPredictResultNumber;
            return this;
        }
        public Long getCouponOldPredictResultNumber() {
            return this.couponOldPredictResultNumber;
        }

        public ListTasksResponseBodyDataList setCouponOldPriceStep(Long couponOldPriceStep) {
            this.couponOldPriceStep = couponOldPriceStep;
            return this;
        }
        public Long getCouponOldPriceStep() {
            return this.couponOldPriceStep;
        }

        public ListTasksResponseBodyDataList setCurrencyType(Long currencyType) {
            this.currencyType = currencyType;
            return this;
        }
        public Long getCurrencyType() {
            return this.currencyType;
        }

        public ListTasksResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListTasksResponseBodyDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTasksResponseBodyDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTasksResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTasksResponseBodyDataList setLoginActualResultNumber(Long loginActualResultNumber) {
            this.loginActualResultNumber = loginActualResultNumber;
            return this;
        }
        public Long getLoginActualResultNumber() {
            return this.loginActualResultNumber;
        }

        public ListTasksResponseBodyDataList setLoginPredictResultNumber(Long loginPredictResultNumber) {
            this.loginPredictResultNumber = loginPredictResultNumber;
            return this;
        }
        public Long getLoginPredictResultNumber() {
            return this.loginPredictResultNumber;
        }

        public ListTasksResponseBodyDataList setMainId(Long mainId) {
            this.mainId = mainId;
            return this;
        }
        public Long getMainId() {
            return this.mainId;
        }

        public ListTasksResponseBodyDataList setMainType(Long mainType) {
            this.mainType = mainType;
            return this;
        }
        public Long getMainType() {
            return this.mainType;
        }

        public ListTasksResponseBodyDataList setOpNick(String opNick) {
            this.opNick = opNick;
            return this;
        }
        public String getOpNick() {
            return this.opNick;
        }

        public ListTasksResponseBodyDataList setOrderActualResultNumber(Long orderActualResultNumber) {
            this.orderActualResultNumber = orderActualResultNumber;
            return this;
        }
        public Long getOrderActualResultNumber() {
            return this.orderActualResultNumber;
        }

        public ListTasksResponseBodyDataList setOrderPredictResultNumber(Long orderPredictResultNumber) {
            this.orderPredictResultNumber = orderPredictResultNumber;
            return this;
        }
        public Long getOrderPredictResultNumber() {
            return this.orderPredictResultNumber;
        }

        public ListTasksResponseBodyDataList setPredictBankRegisterVO(ListTasksResponseBodyDataListPredictBankRegisterVO predictBankRegisterVO) {
            this.predictBankRegisterVO = predictBankRegisterVO;
            return this;
        }
        public ListTasksResponseBodyDataListPredictBankRegisterVO getPredictBankRegisterVO() {
            return this.predictBankRegisterVO;
        }

        public ListTasksResponseBodyDataList setPredictCommonSceneVO(java.util.Map<String, String> predictCommonSceneVO) {
            this.predictCommonSceneVO = predictCommonSceneVO;
            return this;
        }
        public java.util.Map<String, String> getPredictCommonSceneVO() {
            return this.predictCommonSceneVO;
        }

        public ListTasksResponseBodyDataList setPredictConsumeAmount(Long predictConsumeAmount) {
            this.predictConsumeAmount = predictConsumeAmount;
            return this;
        }
        public Long getPredictConsumeAmount() {
            return this.predictConsumeAmount;
        }

        public ListTasksResponseBodyDataList setPredictInfo(String predictInfo) {
            this.predictInfo = predictInfo;
            return this;
        }
        public String getPredictInfo() {
            return this.predictInfo;
        }

        public ListTasksResponseBodyDataList setPriceType(Long priceType) {
            this.priceType = priceType;
            return this;
        }
        public Long getPriceType() {
            return this.priceType;
        }

        public ListTasksResponseBodyDataList setProxyUserId(Long proxyUserId) {
            this.proxyUserId = proxyUserId;
            return this;
        }
        public Long getProxyUserId() {
            return this.proxyUserId;
        }

        public ListTasksResponseBodyDataList setProxyUserNick(String proxyUserNick) {
            this.proxyUserNick = proxyUserNick;
            return this;
        }
        public String getProxyUserNick() {
            return this.proxyUserNick;
        }

        public ListTasksResponseBodyDataList setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListTasksResponseBodyDataList setScheduleType(Long scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Long getScheduleType() {
            return this.scheduleType;
        }

        public ListTasksResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListTasksResponseBodyDataList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyDataList setSystemActualConsumeAmount(Long systemActualConsumeAmount) {
            this.systemActualConsumeAmount = systemActualConsumeAmount;
            return this;
        }
        public Long getSystemActualConsumeAmount() {
            return this.systemActualConsumeAmount;
        }

        public ListTasksResponseBodyDataList setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public ListTasksResponseBodyDataList setTaskGroupId(Long taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public Long getTaskGroupId() {
            return this.taskGroupId;
        }

        public ListTasksResponseBodyDataList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListTasksResponseBodyDataList setTaskMarketingType(Long taskMarketingType) {
            this.taskMarketingType = taskMarketingType;
            return this;
        }
        public Long getTaskMarketingType() {
            return this.taskMarketingType;
        }

        public ListTasksResponseBodyDataList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTasksResponseBodyDataList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class ListTasksResponseBodyData extends TeaModel {
        @NameInMap("BizTypes")
        public String bizTypes;

        @NameInMap("Count")
        public Long count;

        @NameInMap("List")
        public java.util.List<ListTasksResponseBodyDataList> list;

        @NameInMap("TaskRules")
        public String taskRules;

        @NameInMap("Type")
        public Integer type;

        public static ListTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyData self = new ListTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyData setBizTypes(String bizTypes) {
            this.bizTypes = bizTypes;
            return this;
        }
        public String getBizTypes() {
            return this.bizTypes;
        }

        public ListTasksResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListTasksResponseBodyData setList(java.util.List<ListTasksResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTasksResponseBodyDataList> getList() {
            return this.list;
        }

        public ListTasksResponseBodyData setTaskRules(String taskRules) {
            this.taskRules = taskRules;
            return this;
        }
        public String getTaskRules() {
            return this.taskRules;
        }

        public ListTasksResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
