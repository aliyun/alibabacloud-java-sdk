// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeLoginTicketResponseBody extends TeaModel {
    @NameInMap("LoginTicket")
    public DescribeLoginTicketResponseBodyLoginTicket loginTicket;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLoginTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginTicketResponseBody self = new DescribeLoginTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoginTicketResponseBody setLoginTicket(DescribeLoginTicketResponseBodyLoginTicket loginTicket) {
        this.loginTicket = loginTicket;
        return this;
    }
    public DescribeLoginTicketResponseBodyLoginTicket getLoginTicket() {
        return this.loginTicket;
    }

    public DescribeLoginTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLoginTicketResponseBodyLoginTicketZones extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeLoginTicketResponseBodyLoginTicketZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginTicketResponseBodyLoginTicketZones self = new DescribeLoginTicketResponseBodyLoginTicketZones();
            return TeaModel.build(map, self);
        }

        public DescribeLoginTicketResponseBodyLoginTicketZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeLoginTicketResponseBodyLoginTicketZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeLoginTicketResponseBodyLoginTicket extends TeaModel {
        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("Zones")
        public java.util.List<DescribeLoginTicketResponseBodyLoginTicketZones> zones;

        public static DescribeLoginTicketResponseBodyLoginTicket build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginTicketResponseBodyLoginTicket self = new DescribeLoginTicketResponseBodyLoginTicket();
            return TeaModel.build(map, self);
        }

        public DescribeLoginTicketResponseBodyLoginTicket setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DescribeLoginTicketResponseBodyLoginTicket setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
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
