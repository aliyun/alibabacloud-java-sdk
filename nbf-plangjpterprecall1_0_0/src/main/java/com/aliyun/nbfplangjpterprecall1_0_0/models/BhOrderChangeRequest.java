// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfplangjpterprecall1_0_0.models;

import com.aliyun.tea.*;

public class BhOrderChangeRequest extends TeaModel {
    // 明细列表
    @NameInMap("items")
    public java.util.List<BhOrderChangeRequestItems> items;

    // 外部ERP编码
    @NameInMap("outerErpCode")
    public String outerErpCode;

    // 外部ERP单据号
    @NameInMap("outerOrderCode")
    public String outerOrderCode;

    // 外部ERP单据在ASCP流转的状态
    @NameInMap("outerOrderStatus")
    public Integer outerOrderStatus;

    // 外部ERP单据在ASCP流转的状态描述
    @NameInMap("outerOrderStatusStr")
    public String outerOrderStatusStr;

    // 平台商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 平台商ID
    @NameInMap("routeSupplierId")
    public Long routeSupplierId;

    public static BhOrderChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        BhOrderChangeRequest self = new BhOrderChangeRequest();
        return TeaModel.build(map, self);
    }

    public BhOrderChangeRequest setItems(java.util.List<BhOrderChangeRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<BhOrderChangeRequestItems> getItems() {
        return this.items;
    }

    public BhOrderChangeRequest setOuterErpCode(String outerErpCode) {
        this.outerErpCode = outerErpCode;
        return this;
    }
    public String getOuterErpCode() {
        return this.outerErpCode;
    }

    public BhOrderChangeRequest setOuterOrderCode(String outerOrderCode) {
        this.outerOrderCode = outerOrderCode;
        return this;
    }
    public String getOuterOrderCode() {
        return this.outerOrderCode;
    }

    public BhOrderChangeRequest setOuterOrderStatus(Integer outerOrderStatus) {
        this.outerOrderStatus = outerOrderStatus;
        return this;
    }
    public Integer getOuterOrderStatus() {
        return this.outerOrderStatus;
    }

    public BhOrderChangeRequest setOuterOrderStatusStr(String outerOrderStatusStr) {
        this.outerOrderStatusStr = outerOrderStatusStr;
        return this;
    }
    public String getOuterOrderStatusStr() {
        return this.outerOrderStatusStr;
    }

    public BhOrderChangeRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public BhOrderChangeRequest setRouteSupplierId(Long routeSupplierId) {
        this.routeSupplierId = routeSupplierId;
        return this;
    }
    public Long getRouteSupplierId() {
        return this.routeSupplierId;
    }

    public static class BhOrderChangeRequestItems extends TeaModel {
        // 计划量
        @NameInMap("confirmQuantity")
        public Long confirmQuantity;

        // 执行单号
        @NameInMap("executeOrderCode")
        public String executeOrderCode;

        // 计划单号
        @NameInMap("orderCode")
        public String orderCode;

        // 计划单异常编码
        @NameInMap("orderErrorCode")
        public String orderErrorCode;

        // 计划单异常原因
        @NameInMap("orderErrorMsg")
        public String orderErrorMsg;

        // 计划单状态
        @NameInMap("orderStatus")
        public Integer orderStatus;

        // 计划单状态描述
        @NameInMap("orderStatusStr")
        public String orderStatusStr;

        // 外部ERP单据明细号
        @NameInMap("outerOrderItemCode")
        public String outerOrderItemCode;

        // 货品ID
        @NameInMap("scItemId")
        public Long scItemId;

        public static BhOrderChangeRequestItems build(java.util.Map<String, ?> map) throws Exception {
            BhOrderChangeRequestItems self = new BhOrderChangeRequestItems();
            return TeaModel.build(map, self);
        }

        public BhOrderChangeRequestItems setConfirmQuantity(Long confirmQuantity) {
            this.confirmQuantity = confirmQuantity;
            return this;
        }
        public Long getConfirmQuantity() {
            return this.confirmQuantity;
        }

        public BhOrderChangeRequestItems setExecuteOrderCode(String executeOrderCode) {
            this.executeOrderCode = executeOrderCode;
            return this;
        }
        public String getExecuteOrderCode() {
            return this.executeOrderCode;
        }

        public BhOrderChangeRequestItems setOrderCode(String orderCode) {
            this.orderCode = orderCode;
            return this;
        }
        public String getOrderCode() {
            return this.orderCode;
        }

        public BhOrderChangeRequestItems setOrderErrorCode(String orderErrorCode) {
            this.orderErrorCode = orderErrorCode;
            return this;
        }
        public String getOrderErrorCode() {
            return this.orderErrorCode;
        }

        public BhOrderChangeRequestItems setOrderErrorMsg(String orderErrorMsg) {
            this.orderErrorMsg = orderErrorMsg;
            return this;
        }
        public String getOrderErrorMsg() {
            return this.orderErrorMsg;
        }

        public BhOrderChangeRequestItems setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public BhOrderChangeRequestItems setOrderStatusStr(String orderStatusStr) {
            this.orderStatusStr = orderStatusStr;
            return this;
        }
        public String getOrderStatusStr() {
            return this.orderStatusStr;
        }

        public BhOrderChangeRequestItems setOuterOrderItemCode(String outerOrderItemCode) {
            this.outerOrderItemCode = outerOrderItemCode;
            return this;
        }
        public String getOuterOrderItemCode() {
            return this.outerOrderItemCode;
        }

        public BhOrderChangeRequestItems setScItemId(Long scItemId) {
            this.scItemId = scItemId;
            return this;
        }
        public Long getScItemId() {
            return this.scItemId;
        }

    }

}
