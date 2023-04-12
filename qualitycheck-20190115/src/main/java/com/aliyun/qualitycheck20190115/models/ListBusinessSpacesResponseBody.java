// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListBusinessSpacesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<ListBusinessSpacesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBusinessSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessSpacesResponseBody self = new ListBusinessSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBusinessSpacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBusinessSpacesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListBusinessSpacesResponseBody setData(java.util.List<ListBusinessSpacesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBusinessSpacesResponseBodyData> getData() {
        return this.data;
    }

    public ListBusinessSpacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBusinessSpacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBusinessSpacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBusinessSpacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBusinessSpacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBusinessSpacesResponseBodyData extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("BusinessSpaceCode")
        public String businessSpaceCode;

        @NameInMap("BusinessSpaceName")
        public String businessSpaceName;

        @NameInMap("CurrentStatus")
        public Integer currentStatus;

        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>id。</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Language")
        public String language;

        @NameInMap("LoginUserType")
        public Integer loginUserType;

        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SubAliUid")
        public Long subAliUid;

        @NameInMap("XspaceCommodityCode")
        public String xspaceCommodityCode;

        @NameInMap("XspaceProductCode")
        public String xspaceProductCode;

        public static ListBusinessSpacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessSpacesResponseBodyData self = new ListBusinessSpacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBusinessSpacesResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListBusinessSpacesResponseBodyData setBusinessSpaceCode(String businessSpaceCode) {
            this.businessSpaceCode = businessSpaceCode;
            return this;
        }
        public String getBusinessSpaceCode() {
            return this.businessSpaceCode;
        }

        public ListBusinessSpacesResponseBodyData setBusinessSpaceName(String businessSpaceName) {
            this.businessSpaceName = businessSpaceName;
            return this;
        }
        public String getBusinessSpaceName() {
            return this.businessSpaceName;
        }

        public ListBusinessSpacesResponseBodyData setCurrentStatus(Integer currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public Integer getCurrentStatus() {
            return this.currentStatus;
        }

        public ListBusinessSpacesResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListBusinessSpacesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBusinessSpacesResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListBusinessSpacesResponseBodyData setLoginUserType(Integer loginUserType) {
            this.loginUserType = loginUserType;
            return this;
        }
        public Integer getLoginUserType() {
            return this.loginUserType;
        }

        public ListBusinessSpacesResponseBodyData setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public ListBusinessSpacesResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListBusinessSpacesResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListBusinessSpacesResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListBusinessSpacesResponseBodyData setSubAliUid(Long subAliUid) {
            this.subAliUid = subAliUid;
            return this;
        }
        public Long getSubAliUid() {
            return this.subAliUid;
        }

        public ListBusinessSpacesResponseBodyData setXspaceCommodityCode(String xspaceCommodityCode) {
            this.xspaceCommodityCode = xspaceCommodityCode;
            return this;
        }
        public String getXspaceCommodityCode() {
            return this.xspaceCommodityCode;
        }

        public ListBusinessSpacesResponseBodyData setXspaceProductCode(String xspaceProductCode) {
            this.xspaceProductCode = xspaceProductCode;
            return this;
        }
        public String getXspaceProductCode() {
            return this.xspaceProductCode;
        }

    }

}
