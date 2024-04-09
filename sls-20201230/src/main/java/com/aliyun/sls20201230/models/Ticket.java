// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Ticket extends TeaModel {
    @NameInMap("callerUid")
    public Long callerUid;

    @NameInMap("createDate")
    public String createDate;

    @NameInMap("expirationTime")
    public Long expirationTime;

    @NameInMap("expireDate")
    public String expireDate;

    @NameInMap("extra")
    public String extra;

    @NameInMap("name")
    public String name;

    @NameInMap("number")
    public Integer number;

    @NameInMap("sharingTo")
    public String sharingTo;

    @NameInMap("ticket")
    public String ticket;

    @NameInMap("ticketId")
    public String ticketId;

    @NameInMap("usedNumber")
    public Integer usedNumber;

    @NameInMap("valid")
    public Boolean valid;

    public static Ticket build(java.util.Map<String, ?> map) throws Exception {
        Ticket self = new Ticket();
        return TeaModel.build(map, self);
    }

    public Ticket setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public Ticket setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public Ticket setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public Ticket setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public Ticket setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public Ticket setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Ticket setNumber(Integer number) {
        this.number = number;
        return this;
    }
    public Integer getNumber() {
        return this.number;
    }

    public Ticket setSharingTo(String sharingTo) {
        this.sharingTo = sharingTo;
        return this;
    }
    public String getSharingTo() {
        return this.sharingTo;
    }

    public Ticket setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

    public Ticket setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public Ticket setUsedNumber(Integer usedNumber) {
        this.usedNumber = usedNumber;
        return this;
    }
    public Integer getUsedNumber() {
        return this.usedNumber;
    }

    public Ticket setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

}
