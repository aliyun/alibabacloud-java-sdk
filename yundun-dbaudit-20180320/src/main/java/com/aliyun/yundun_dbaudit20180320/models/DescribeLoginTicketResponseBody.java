// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeLoginTicketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoginTicket")
    public DescribeLoginTicketResponseBodyLoginTicket loginTicket;

    public static DescribeLoginTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginTicketResponseBody self = new DescribeLoginTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoginTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoginTicketResponseBody setLoginTicket(DescribeLoginTicketResponseBodyLoginTicket loginTicket) {
        this.loginTicket = loginTicket;
        return this;
    }
    public DescribeLoginTicketResponseBodyLoginTicket getLoginTicket() {
        return this.loginTicket;
    }

    public static class DescribeLoginTicketResponseBodyLoginTicketZones extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("LocalName")
        public String localName;

        public static DescribeLoginTicketResponseBodyLoginTicketZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginTicketResponseBodyLoginTicketZones self = new DescribeLoginTicketResponseBodyLoginTicketZones();
            return TeaModel.build(map, self);
        }

        public DescribeLoginTicketResponseBodyLoginTicketZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeLoginTicketResponseBodyLoginTicketZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

    }

    public static class DescribeLoginTicketResponseBodyLoginTicket extends TeaModel {
        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Zones")
        public java.util.List<DescribeLoginTicketResponseBodyLoginTicketZones> zones;

        public static DescribeLoginTicketResponseBodyLoginTicket build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginTicketResponseBodyLoginTicket self = new DescribeLoginTicketResponseBodyLoginTicket();
            return TeaModel.build(map, self);
        }

        public DescribeLoginTicketResponseBodyLoginTicket setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public DescribeLoginTicketResponseBodyLoginTicket setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DescribeLoginTicketResponseBodyLoginTicket setZones(java.util.List<DescribeLoginTicketResponseBodyLoginTicketZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<DescribeLoginTicketResponseBodyLoginTicketZones> getZones() {
            return this.zones;
        }

    }

}
