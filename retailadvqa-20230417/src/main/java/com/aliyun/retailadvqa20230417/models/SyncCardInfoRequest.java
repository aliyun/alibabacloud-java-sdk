// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class SyncCardInfoRequest extends TeaModel {
    @NameInMap("body")
    public SyncCardInfoRequestBody body;

    public static SyncCardInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncCardInfoRequest self = new SyncCardInfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncCardInfoRequest setBody(SyncCardInfoRequestBody body) {
        this.body = body;
        return this;
    }
    public SyncCardInfoRequestBody getBody() {
        return this.body;
    }

    public static class SyncCardInfoRequestBodyGifters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx/2.jpg">https://xxx/2.jpg</a></p>
         */
        @NameInMap("HeaderImg")
        public String headerImg;

        /**
         * <strong>example:</strong>
         * <p>1000030820003</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>openId</p>
         * 
         * <strong>example:</strong>
         * <p>82ace612cd377134d597e32e91562caf</p>
         */
        @NameInMap("OpenId")
        public String openId;

        /**
         * <strong>example:</strong>
         * <p>13277778888</p>
         */
        @NameInMap("Phone")
        public String phone;

        public static SyncCardInfoRequestBodyGifters build(java.util.Map<String, ?> map) throws Exception {
            SyncCardInfoRequestBodyGifters self = new SyncCardInfoRequestBodyGifters();
            return TeaModel.build(map, self);
        }

        public SyncCardInfoRequestBodyGifters setHeaderImg(String headerImg) {
            this.headerImg = headerImg;
            return this;
        }
        public String getHeaderImg() {
            return this.headerImg;
        }

        public SyncCardInfoRequestBodyGifters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SyncCardInfoRequestBodyGifters setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public SyncCardInfoRequestBodyGifters setOpenId(String openId) {
            this.openId = openId;
            return this;
        }
        public String getOpenId() {
            return this.openId;
        }

        public SyncCardInfoRequestBodyGifters setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class SyncCardInfoRequestBodyPresentDetail extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Price")
        public Double price;

        @NameInMap("SkuId")
        public String skuId;

        public static SyncCardInfoRequestBodyPresentDetail build(java.util.Map<String, ?> map) throws Exception {
            SyncCardInfoRequestBodyPresentDetail self = new SyncCardInfoRequestBodyPresentDetail();
            return TeaModel.build(map, self);
        }

        public SyncCardInfoRequestBodyPresentDetail setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public SyncCardInfoRequestBodyPresentDetail setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SyncCardInfoRequestBodyPresentDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SyncCardInfoRequestBodyPresentDetail setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public SyncCardInfoRequestBodyPresentDetail setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

    }

    public static class SyncCardInfoRequestBodyRecipient extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx/1.jpg">https://xxx/1.jpg</a></p>
         */
        @NameInMap("HeaderImg")
        public String headerImg;

        /**
         * <strong>example:</strong>
         * <p>1000030855004</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>openId</p>
         * 
         * <strong>example:</strong>
         * <p>1179ead68b3833fea61a802ddb1dd3ac</p>
         */
        @NameInMap("OpenId")
        public String openId;

        /**
         * <strong>example:</strong>
         * <p>18899998888</p>
         */
        @NameInMap("Phone")
        public String phone;

        public static SyncCardInfoRequestBodyRecipient build(java.util.Map<String, ?> map) throws Exception {
            SyncCardInfoRequestBodyRecipient self = new SyncCardInfoRequestBodyRecipient();
            return TeaModel.build(map, self);
        }

        public SyncCardInfoRequestBodyRecipient setHeaderImg(String headerImg) {
            this.headerImg = headerImg;
            return this;
        }
        public String getHeaderImg() {
            return this.headerImg;
        }

        public SyncCardInfoRequestBodyRecipient setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SyncCardInfoRequestBodyRecipient setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public SyncCardInfoRequestBodyRecipient setOpenId(String openId) {
            this.openId = openId;
            return this;
        }
        public String getOpenId() {
            return this.openId;
        }

        public SyncCardInfoRequestBodyRecipient setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class SyncCardInfoRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1236437142867408</p>
         */
        @NameInMap("BuyerId")
        public String buyerId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Extra")
        public String extra;

        @NameInMap("Gifters")
        public SyncCardInfoRequestBodyGifters gifters;

        /**
         * <strong>example:</strong>
         * <p>2023-05-12 00:00:00</p>
         */
        @NameInMap("OccurredAt")
        public String occurredAt;

        /**
         * <strong>example:</strong>
         * <p>750cff00c3e0996d220ac2861dafdfadsf</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
         * <strong>example:</strong>
         * <p>223332140970453</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PresentDetail")
        public java.util.List<SyncCardInfoRequestBodyPresentDetail> presentDetail;

        /**
         * <strong>example:</strong>
         * <p>2023-05-12 00:00:00</p>
         */
        @NameInMap("ReceivedAt")
        public String receivedAt;

        @NameInMap("Recipient")
        public SyncCardInfoRequestBodyRecipient recipient;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Theme")
        public String theme;

        /**
         * <strong>example:</strong>
         * <p>3eecd2b8a6f946ca</p>
         */
        @NameInMap("TransferId")
        public String transferId;

        /**
         * <strong>example:</strong>
         * <p>2023-05-12 00:00:00</p>
         */
        @NameInMap("TransferredAt")
        public String transferredAt;

        public static SyncCardInfoRequestBody build(java.util.Map<String, ?> map) throws Exception {
            SyncCardInfoRequestBody self = new SyncCardInfoRequestBody();
            return TeaModel.build(map, self);
        }

        public SyncCardInfoRequestBody setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public SyncCardInfoRequestBody setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public SyncCardInfoRequestBody setGifters(SyncCardInfoRequestBodyGifters gifters) {
            this.gifters = gifters;
            return this;
        }
        public SyncCardInfoRequestBodyGifters getGifters() {
            return this.gifters;
        }

        public SyncCardInfoRequestBody setOccurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }
        public String getOccurredAt() {
            return this.occurredAt;
        }

        public SyncCardInfoRequestBody setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public SyncCardInfoRequestBody setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public SyncCardInfoRequestBody setPresentDetail(java.util.List<SyncCardInfoRequestBodyPresentDetail> presentDetail) {
            this.presentDetail = presentDetail;
            return this;
        }
        public java.util.List<SyncCardInfoRequestBodyPresentDetail> getPresentDetail() {
            return this.presentDetail;
        }

        public SyncCardInfoRequestBody setReceivedAt(String receivedAt) {
            this.receivedAt = receivedAt;
            return this;
        }
        public String getReceivedAt() {
            return this.receivedAt;
        }

        public SyncCardInfoRequestBody setRecipient(SyncCardInfoRequestBodyRecipient recipient) {
            this.recipient = recipient;
            return this;
        }
        public SyncCardInfoRequestBodyRecipient getRecipient() {
            return this.recipient;
        }

        public SyncCardInfoRequestBody setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SyncCardInfoRequestBody setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

        public SyncCardInfoRequestBody setTransferId(String transferId) {
            this.transferId = transferId;
            return this;
        }
        public String getTransferId() {
            return this.transferId;
        }

        public SyncCardInfoRequestBody setTransferredAt(String transferredAt) {
            this.transferredAt = transferredAt;
            return this;
        }
        public String getTransferredAt() {
            return this.transferredAt;
        }

    }

}
